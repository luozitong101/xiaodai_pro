package lzt.xiaodai.cn.common.jwt.inteceptor;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTDecodeException;
import com.auth0.jwt.exceptions.JWTVerificationException;
import lzt.xiaodai.cn.common.jwt.annotation.PassToken;
import lzt.xiaodai.cn.common.jwt.annotation.UserLoginToken;
import lzt.xiaodai.cn.entity.TAdmin;
import lzt.xiaodai.cn.entity.TRegister;
import lzt.xiaodai.cn.service.TAdminService;
import lzt.xiaodai.cn.service.TRegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.lang.reflect.Method;

/**
 * @author luoyong
 * @Date: 2019/4/1 23:09
 * @Description: jwt 认证拦截
 */
public class AuthenticationInterceptor implements HandlerInterceptor {
    @Autowired
    TRegisterService tRegisterService;
    @Autowired
    TAdminService tAdminService;
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String token = request.getHeader("token");
        if (!(handler instanceof HandlerMethod)){
            return  true;
        }
        HandlerMethod handlerMethod = (HandlerMethod)handler;
        Method method = handlerMethod.getMethod();
        if (method.isAnnotationPresent(PassToken.class)){
            PassToken passToken = method.getAnnotation(PassToken.class);
            if (passToken.required()){
                return  true;
            }
        }

        if (method.isAnnotationPresent(UserLoginToken.class)){

            UserLoginToken userLoginToken = method.getAnnotation(UserLoginToken.class);
            if (userLoginToken.required()){
                //执行认证
                if (token == null){
                    throw  new RuntimeException("无token,请重新登录");
                }
                String s = null;
                try {
                    s = JWT.decode(token).getAudience().get(0);
                } catch (JWTDecodeException e) {
                    throw new RuntimeException("401");
                }
                if (s == null){
                    return  false;
                }
                // {id:1,mobile:"15618759969",username:"luoyong"}
//                Map map = JacksonUtil.JsonToBean(s, Map.class);
                TRegister register = tRegisterService.getById(Integer.parseInt(s));
                TAdmin admin = tAdminService.getById(Integer.parseInt(s));
                if (register == null && admin == null){
                    throw new RuntimeException("用户不存在");
                }
                String pwd = "";
                if (register != null){
                    pwd = register.getPassword();
                }
                if (admin != null){
                    pwd = admin.getPassword();
                }
                // 验证 token
                JWTVerifier jwtVerifier = JWT.require(Algorithm.HMAC256(pwd)).build();
                try {
                    jwtVerifier.verify(token);
                } catch (JWTVerificationException e) {
                    throw new RuntimeException("401");
                }
                return true;
            }
        }
        return true;
    }
}
