package cn.edu.hit.dataservice.common.exception;


public class BaseException extends RuntimeException{

    private final int code;

    private int httpStatus;

    public BaseException(String message, int code) {
        super(message);
        this.code = code;
    }

    public BaseException(BaseExceptionType baseExceptionType){
        super(baseExceptionType.getMsg());
        this.code = baseExceptionType.getCode();
        this.httpStatus = baseExceptionType.getHttpStatus();
    }

    public int getCode(){
        return code;
    }
    public int getHttpStatus(){
        return httpStatus;
    }
}
