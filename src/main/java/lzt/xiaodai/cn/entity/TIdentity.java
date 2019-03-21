package lzt.xiaodai.cn.entity;

import java.io.Serializable;

import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 身份认证
 * </p>
 *
 * @author 来自底程序员的仰望
 * @since 2019-03-21
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class TIdentity implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;

    /**
     * 真实姓名
     */
    private String realname;

    /**
     * 身份认证
     */
    private String idcard;

    /**
     * 0 未认证 1 认证
     */
    private Integer status;
    @TableField("extends_1")
    private String extends1;
    @TableField("extends_2")
    private String extends2;


}
