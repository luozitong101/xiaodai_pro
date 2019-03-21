package lzt.xiaodai.cn.common;

/**
 * @author luoyong
 * @Date: 2019/3/21 17:34
 * @Description: 封装统一的返回对象
 */
public class PageResult<T> extends BaseResult {

    private T ret;


    private PageResult() {
    }

    public static PageResult build(){
        return new PageResult();
    }
    public PageResult(int code, String message) {
        super(code, message);
    }

    public PageResult ok(T t) {
        this.ok();
        this.ret = t;
        return this;
    }

    public PageResult ok(){
        this.code = 200;
        this.message = "success";
        return this;
    }


    public PageResult failed(Object t){
        this.failed().ret = t;
        return this;

    }

    public PageResult failed(){
        this.code = 500;
        this.message = "failed";
        return this;
    }

    public T getRet() {
        return ret;
    }

    public void setRet(T ret) {
        this.ret = ret;
    }
}


