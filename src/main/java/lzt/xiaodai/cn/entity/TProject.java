package lzt.xiaodai.cn.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 对应用户的所有借款信息 
 * </p>
 *
 * @author 来自底程序员的仰望
 * @since 2019-03-21
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class TProject implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 关联的用户信息id
     */
    private Integer infoid;

    /**
     * 关联银行卡认证id
     */
    private Integer authbankid;

    /**
     * 关联手机认证id
     */
    private Integer authmobileid;

    /**
     * 关联身份认证id
     */
    private Integer identityid;

    /**
     * 关联注册用户id
     */
    private Integer registerid;

    /**
     * 关联借款项id
     */
    private Integer itemid;

    private String extends1;

    /**
     * 关联审核id
     */
    private Integer auditid;

    /**
     * 手机号
     */
    private String mobile;


}
