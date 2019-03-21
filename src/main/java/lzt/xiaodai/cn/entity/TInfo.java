package lzt.xiaodai.cn.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 个人信息包括职业信息社会关系
 * </p>
 *
 * @author 来自底程序员的仰望
 * @since 2019-03-21
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class TInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 亲属关系
     */
    private String relation;

    /**
     * 社会关系
     */
    private String socialrelation;

    /**
     * 亲属电话
     */
    private String relationphone;

    /**
     * 社会联系人电话
     */
    private String socialrelationphone;

    /**
     * 职业
     */
    private String profession;

    /**
     * 月收入
     */
    private String income;

    /**
     * 单位名称
     */
    private String orgname;

    /**
     * 单位地址
     */
    private String orgaddress;

    /**
     * 单位所属省市
     */
    private String orgprovince;

    /**
     * 单位电话
     */
    private String orgphone;

    private String qq;

    private String email;

    /**
     * 0 未婚   1 已婚
     */
    private Integer maritalstatus;

    /**
     * 学历
     */
    private String education;

    /**
     * 常驻地址
     */
    private String homeaddress;

    private String extends1;

    private String extends2;

    /**
     * 身份证照片
     */
    private Integer imageid;

    /**
     * 手机号码
     */
    private String mobile;


}
