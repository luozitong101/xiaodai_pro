package lzt.xiaodai.cn.tool;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import lzt.xiaodai.cn.common.EasyUiDataGird;


/**
 * @author luoyong
 * @Date: 2019/3/24 21:55
 * @Description:
 */
public class PageHelper<T> {


    public static <T> EasyUiDataGird<T> getPageResult(long page, long rows, BaseMapper<T> mapper, Wrapper<T> wrapper){
        Page<T> p  = new Page<>(page,rows);
        IPage<T> tiPage = mapper.selectPage(p, wrapper);
        EasyUiDataGird<T> easyUiDataGird = new EasyUiDataGird<>();
        easyUiDataGird.setTotal(Integer.parseInt(tiPage.getTotal()+""));
        easyUiDataGird.setRows(tiPage.getRecords());
        return easyUiDataGird;
    }

    public static <T> IPage<T> getPage(long page,long rows,BaseMapper<T> mapper, Wrapper<T> wrapper){
        Page<T> p  = new Page<>(page,rows);
        IPage<T> tiPage = mapper.selectPage(p, wrapper);
        return tiPage;
    }

}
