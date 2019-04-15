package lzt.xiaodai.cn.entity.vo;

import lombok.Data;

/**
 * @author luoyong
 * @Date: 2019/4/15 16:57
 * @Description: 待审批vo
 */
@Data
public class Pending {

    private Integer id;
    private String name;
    private String mobile;
    private String idCard;
    private Integer borrowMoney;
    private Integer day;
    private String borrowTime;
    private Integer phrase;
    private Integer contactId;
    private Integer imageId;
    private String bankNo;
    private String bankName;

}
