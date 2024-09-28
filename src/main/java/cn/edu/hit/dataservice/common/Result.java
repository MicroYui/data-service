package cn.edu.hit.dataservice.common;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.http.HttpStatus;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Result<T> {
    private int code;

    private T data;

    private String message;

    public Result<T> code(Integer code){
        this.code = code;
        return this;
    }

    public Result<T> message(String message){
        this.message = message;
        return this;
    }

    public Result<T> data(T data){
        this.data = data;
        return this;
    }

    public Result<T> success(){
        this.code = HttpStatus.OK.value();
        this.message = HttpStatus.OK.getReasonPhrase();
        return this;
    }

    public Result<T> fail(){
        this.code = HttpStatus.INTERNAL_SERVER_ERROR.value();
        this.message = HttpStatus.INTERNAL_SERVER_ERROR.getReasonPhrase();
        return this;
    }
}
