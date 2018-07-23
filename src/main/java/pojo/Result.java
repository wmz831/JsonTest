package pojo;

/**
 * Create by Wang Mingzhen om 2018/7/24
 */
public class Result<T> {
    private int code;
    private String msg;
    private boolean isSuccess;
    private T data;

    public Result set(int code, String msg, boolean isSuccess, T data){
        this.code = code;
        this.msg = msg;
        this.isSuccess = isSuccess;
        this.data = data;
        return this;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public boolean isSuccess() {
        return isSuccess;
    }

    public void setSuccess(boolean success) {
        isSuccess = success;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
