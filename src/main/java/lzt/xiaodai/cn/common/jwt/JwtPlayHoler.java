package lzt.xiaodai.cn.common.jwt;

import lombok.Data;

import java.io.Serializable;

/**
 * @author luoyong
 * @Date: 2019/4/1 23:44
 * @Description: 负载
 */
@Data
public class JwtPlayHoler implements Serializable {

    private Integer id;

    private String password;
}
