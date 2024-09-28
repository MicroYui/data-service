package cn.edu.hit.dataservice.common.exception;

import org.springframework.http.HttpStatus;

public enum BaseExceptionEnum implements BaseExceptionType {

    JSON_CONVERSION_FAILED(14000, "JSON and string conversion failed"),
    NOT_NULL_ERROR(14001, "input cannot be null or empty");

    private final Integer code;

    private final String msg;

    private final Integer httpStatus;

    BaseExceptionEnum(Integer code, String msg) {
        this(code, msg, HttpStatus.OK.value());
    }

    BaseExceptionEnum(Integer code, String msg, Integer httpStatus) {
        this.code = code;
        this.msg = msg;
        this.httpStatus = httpStatus;
    }

    public Integer getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    @Override
    public Integer getHttpStatus() {
        return httpStatus;
    }
}
