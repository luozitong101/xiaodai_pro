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
 * 审核项
 * </p>
 *
 * @author 来自底程序员的仰望
 * @since 2019-03-21
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class TAudit implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 0  审核中  1 确认银行卡 2身份认证 3 签约 4放款
     */
    private Integer step;

    /**
     * 审核步骤描述
     */
    private String desc;

    /**
     * 审核人id
     */
    private Integer adminid;

    /**
     * 项目
     */
    private Integer projectid;
    @TableField("extends_1")
    private String extends1;
    @TableField("extends_2")
    private String extends2;
    @TableField("extends_3")
    private String exnteds3;


}
