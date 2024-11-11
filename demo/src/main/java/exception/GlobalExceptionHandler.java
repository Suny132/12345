package exception;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import Response.Response;


@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(Exception.class)
    public Response handleException(Exception e) {
        return new Response(500, null, "服务器内部错误: " + e.getMessage(), false);
    }

    @ExceptionHandler(CustomException.class)
    public Response handleCustomException(CustomException e) {
        return new Response(e.getCode(), null, e.getMessage(), false);
    }
}