package cn.edu.hit.dataservice.common.exception;

import cn.edu.hit.dataservice.common.Result;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class GlobalExceptionHandler {
    // 捕获自定义异常
    @ExceptionHandler(BaseException.class)
    @ResponseBody
    public Result<?> handleBaseException(BaseException e, HttpServletResponse response) {
        response.setStatus(e.getHttpStatus());
        return new Result<>().fail().code(e.getCode()).message(e.getMessage());
    }

    // 捕获所有其他异常
    @ExceptionHandler(Exception.class)
    @ResponseBody
    public Result<?> handleGlobalException(Exception e, HttpServletResponse response) {
        response.setStatus(HttpStatus.INTERNAL_SERVER_ERROR.value());
        return new Result<>().fail().message(e.getMessage());
    }
}
