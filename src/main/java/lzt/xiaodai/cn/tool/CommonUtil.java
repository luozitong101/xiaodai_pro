package lzt.xiaodai.cn.tool;

import lzt.xiaodai.cn.entity.TItem;

import java.util.Date;

/**
 * @author luoyong
 * @Date: 2019/4/3 15:19
 * @Description:
 */
public class CommonUtil {


    public static TItem parseItem(TItem item){
        Integer finalday = item.getDay() == 0 ? 7 : 14;
        Integer money =0;
        if (item.getMoney() == 0){
            money = 1000;
        }else if(item.getMoney() == 1){
            money = 2000;
        }else if (item.getMoney() == 2){
            money = 3000;
        }
        item.setMoney(money);
        item.setDay(finalday);
        return item;
    }

    /**
     * 还款日期
     * @return
     */
    public static String getRetAccount(Date date,Integer day){
        Date date1 = DateUtilFull.addDate(date, 0, 0, day, 0, 0, 0, 0);
        String s = DateUtilFull.parseDateToStr(date1, DateUtilFull.DATE_FORMAT_YYYY_MM_DD);
        return s;
    }
}
