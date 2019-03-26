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
 * app 用户注册表
 * </p>
 *
 * @author 来自底程序员的仰望
 * @since 2019-03-21
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class TRegister implements Serializable {

    private static final long serialVersionUID = 1L;
    public TRegister(){}
    public TRegister(String phone,String password){
        this.phone = phone;
        this.password = password;
    }
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 手机号码
     */
    private String phone;

    /**
     * 密码
     */
    private String password;

    /**
     * 扩展字段
     */
    @TableField("extends_1")
    private String extend1;

    /**
     * 扩展字段
     */
    @TableField("extends_2")
    private String extend2;
    @TableField("extends_3")
    private String extend3;
    @TableField("extends_4")
    private String extend4;
    @TableField("extends_5")
    private String extend5;


}
