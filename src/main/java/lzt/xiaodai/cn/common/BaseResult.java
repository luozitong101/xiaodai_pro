package lzt.xiaodai.cn.common;

import java.io.Serializable;

/**
 * @author luoyong
 * @Date: 2019/3/21 18:10
 * @Description:
 */
public class BaseResult implements Serializable {

    protected int code;

    protected String message;

    public BaseResult(){}

    public BaseResult(int code, String message) {
        this.code = code;
        this.message = message;
    }
}
