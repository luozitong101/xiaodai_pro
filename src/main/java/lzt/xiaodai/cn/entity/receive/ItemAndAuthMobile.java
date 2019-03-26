package lzt.xiaodai.cn.entity.receive;
import java.io.Serializable;

import lombok.Data;
import lzt.xiaodai.cn.entity.TAuthMobile;
import lzt.xiaodai.cn.entity.TItem;

/**
 * 发送到服务端的数据组装
 */
@Data
public class ItemAndAuthMobile implements Serializable {

    private TItem item;
    private TAuthMobile authMobile;
}
