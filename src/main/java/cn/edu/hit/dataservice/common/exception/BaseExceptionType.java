package cn.edu.hit.dataservice.common.exception;

public interface BaseExceptionType {
    /**
     * get the error code of Exception
     * @return error code
     */
    Integer getCode();

    /**
     * get the error message
     * @return error message
     */
    String getMsg();

    /**
     * get the http code
     *
     * @return http code
     */
    default Integer getHttpStatus() {
        return 200;
    }
}
