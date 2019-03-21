package lzt.xiaodai.cn.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 银行卡认证
 * </p>
 *
 * @author 来自底程序员的仰望
 * @since 2019-03-21
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class TAuthBank implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 开户省市
     */
    private String accountprovince;

    /**
     * 预留手机号码
     */
    private String accountphone;

    /**
     * 开户行
     */
    private String accountbank;

    /**
     * 开户银行卡
     */
    private String accountcard;

    /**
     * 0 银行卡 未认证  1 已认证
     */
    private Integer status;
    @TableField("extends_1")
    private String extends1;
    @TableField("extends_2")
    private String extends2;


}
