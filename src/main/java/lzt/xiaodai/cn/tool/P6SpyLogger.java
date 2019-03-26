package lzt.xiaodai.cn.tool;

import com.p6spy.engine.spy.appender.MessageFormattingStrategy;


import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author luoyong
 * @Date: 2019/3/21 12:26
 * @Description:
 */
public class P6SpyLogger implements MessageFormattingStrategy{
    private SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS");

    @Override
    public String formatMessage(int connectionId, String now,
                                long elapsed, String category, String prepared, String sql) {
        if (!sql.trim().equals("")) {
            return format.format(new Date()) + " | took " + elapsed + "ms | "
                    + category + " | connection " + connectionId + "\n " + sql + ";";
        }
        return "";
    }




}
