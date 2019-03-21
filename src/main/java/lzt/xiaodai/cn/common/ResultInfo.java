package lzt.xiaodai.cn.common;

/**
 * @author luoyong
 * @Date: 2019/3/18 11:53
 * @Description:
 */
public class ResultInfo {

    private int code;
    private String message;
    private Object ret;
    public ResultInfo(){
    }
    private static ResultInfo resultInfo = new ResultInfo();

    public static ResultInfo ok(Object data){
        ok();
        resultInfo.ret = data;
        return resultInfo;
    }
    public static ResultInfo ok(){
        resultInfo.message = "success";
        resultInfo.code = 200;
        return resultInfo;
    }

    public static ResultInfo failure(int code,String message){
        resultInfo.message = message;
        resultInfo.code = code;
        return resultInfo;
    }
    public static ResultInfo failure(int code){
        resultInfo.message = "failure";
        resultInfo.code = code;
        return resultInfo;
    }
    public static ResultInfo failure(){
        resultInfo.message = "failure";
        resultInfo.code = 500;
        return resultInfo;
    }



    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getRet() {
        return ret;
    }

    public void setRet(Object ret) {
        this.ret = ret;
    }

    public static ResultInfo getResultInfo() {
        return resultInfo;
    }

    public static void setResultInfo(ResultInfo resultInfo) {
        ResultInfo.resultInfo = resultInfo;
    }
}
