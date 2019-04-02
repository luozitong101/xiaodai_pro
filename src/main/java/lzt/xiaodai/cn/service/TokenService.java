package lzt.xiaodai.cn.service;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import lzt.xiaodai.cn.common.jwt.JwtPlayHoler;
import org.springframework.stereotype.Service;

/**
 * @author luoyong
 * @Date: 2019/4/1 23:31
 * @Description:
 */
@Service
public class TokenService {

    public String getToken(JwtPlayHoler register) {

        String token = "";
//        token = JWT.create().withClaim("id", register.getId())
//                .withClaim("name", "")
//                .withClaim("mobile", register.getPhone())
//                .sign(Algorithm.HMAC256(register.getPassword()));
        token = JWT.create().withAudience(register.getId()+"").sign(Algorithm.HMAC256(register.getPassword()));
        return token;
    }
}
