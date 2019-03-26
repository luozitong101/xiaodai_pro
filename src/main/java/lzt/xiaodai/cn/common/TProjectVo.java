package lzt.xiaodai.cn.common;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import lzt.xiaodai.cn.entity.*;

import java.io.Serializable;

/**
 * @author luoyong
 * @Date: 2019/3/23 22:41
 * @Description:
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class TProjectVo implements Serializable {
    /**
     * 申请用户的详细信息
     */
    private TInfo info;
    /**
     * 银行卡号 和开户行
     */
    private TAuthBank authBank;
    /**
     * 手机号运营商
     */
    private TAuthMobile authMobile;
    /**
     * 真是姓名身份证
     */
    private TIdentity identity;
    /**
     * 注册用户手机密码
     */
    private TRegister tRegister;
    /**
     * 申请贷款种类
     */
    private TItem item;
    /**
     * 审核人
     */
    private TAdmin admin;
    /**
     * 审核步骤
     */
    private TAudit audit;

    private TImage image;
    /**
     * 手机号码
     */
    private String mobile;


}
