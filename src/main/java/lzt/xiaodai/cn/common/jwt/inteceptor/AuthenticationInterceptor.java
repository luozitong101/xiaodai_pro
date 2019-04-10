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
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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
    private static final Logger logger = LoggerFactory.getLogger(AuthenticationInterceptor.class);
    @Autowired
    TRegisterService tRegisterService;
    @Autowired
    TAdminService tAdminService;
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        logger.info("request url:{}",request.getRequestURL().toString());
        String token = request.getParameter("token");
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
               return interceptor(token);
            }
        }
        if (request.getRequestURL().toString().contains("login")){
            return true;
        }
        return interceptor(token);
    }

    public boolean interceptor( String token){
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

        TRegister register = tRegisterService.getById(Integer.parseInt(s));
        TAdmin admin = tAdminService.getById(Integer.parseInt(s));
        if (register == null && admin == null){
            throw new RuntimeException("用户不存在");
        }
        String pwd = "";
        if (admin != null){
            pwd = admin.getPassword();
        }
        if (register != null){
            pwd = register.getPassword();
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
