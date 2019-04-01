package lzt.xiaodai.cn.entity;

import java.io.Serializable;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

@Data
public class TContact implements Serializable {

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    private String contactname;
    private String contactmobile;
    private Integer infoid;
}
