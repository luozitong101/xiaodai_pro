package lzt.xiaodai.cn.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDate;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author 来自底程序员的仰望
 * @since 2019-03-21
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class TItem implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 借款金额
     */
    private Integer money;

    /**
     * 借款时间
     */
    private Integer day;

    /**
     * 手续费
     */
    private Double charge;
    @TableField("extends_1")
    private String extends1;
    @TableField("extends_2")
    private String extends2;
    @TableField("extends_3")
    private String extends3;

    /**
     * 还款日期
     */
    private LocalDate refund;


}
