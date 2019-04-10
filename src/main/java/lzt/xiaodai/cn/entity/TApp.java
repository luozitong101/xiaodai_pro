package lzt.xiaodai.cn.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;

/**
 * @author luoyong
 * @Date: 2019/4/10 11:51
 * @Description:
 */
@Data
public class TApp {


    private Integer id;
    @TableField("versioncode")
    private String versionCode;
    @TableField("versionname")
    private String versionName;
}
