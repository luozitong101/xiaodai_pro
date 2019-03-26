package lzt.xiaodai.cn.common;

import java.util.List;

/**
 * @author luoyong
 * @Date: 2019/3/23 20:43
 * @Description:
 */
public class EasyUiDataGird<T> {
    /**
     * 总记录条数
     */
    private Integer total;
    /**
     * 数据集合
     */
    private List<T> rows;

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public List<T> getRows() {
        return rows;
    }

    public void setRows(List<T> rows) {
        this.rows = rows;
    }

    public EasyUiDataGird() {
    }

    public EasyUiDataGird(List<T> rows) {
        this.rows = rows;
    }

    public EasyUiDataGird(List<T> rows,Integer total){
        this.rows = rows;
        this.total = total;
    }
}
