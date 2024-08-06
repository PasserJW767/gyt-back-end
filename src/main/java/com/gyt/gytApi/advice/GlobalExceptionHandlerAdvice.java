package com.gyt.gytApi.advice;

import com.gyt.gytApi.common.Response;
import com.gyt.gytApi.common.ResultEnum;
import com.gyt.gytApi.exception.APIException;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * 全局异常处理器，所有的控制方法统一返回 APIException
 */
@RestControllerAdvice(basePackages = {"com.gyt.gytApi.controller"})
public class GlobalExceptionHandlerAdvice {

    @Deprecated
    // @ExceptionHandler(Exception.class)
    public Response<String> methodArgumentNotValidException(MethodArgumentNotValidException e) {
        // 从异常对象中拿到ObjectError对象
        ObjectError objectError = e.getBindingResult().getAllErrors().get(0);
        // 然后提取错误提示信息进行返回
        return new Response<>(ResultEnum.VALIDATE_FAILED.getCode(), objectError.getDefaultMessage());
    }

    /**
     * api 调用异常统一处理
     * @param e
     * @return
     */
    @ExceptionHandler(APIException.class)
    public Response<String> apiExceptionHandler(APIException e) {
        return new Response<>(e.getCode(), e.getMsg());
    }
}