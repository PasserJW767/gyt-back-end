package com.gyt.gytApi.advice;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.gyt.gytApi.common.Response;
import com.gyt.gytApi.common.ResultEnum;
import com.gyt.gytApi.exception.APIException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.MethodParameter;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyAdvice;

@Slf4j
@RestControllerAdvice(basePackages = {"com.gyt.gytApi.controller"})
public class ResponseControllerAdvice implements ResponseBodyAdvice<Object> {

    /**
     * 对那些方法需要包装，如果接口直接返回Response就不需要再包装;
     * 如果控制器返回结果不需要包装的条件，只需在控制器方法上配置@NotResponseWrap 注解就跳过包装。
     *
     * @param returnType
     * @param aClass
     * @return 如果为true才会执行beforeBodyWrite
     */
    @Override
    public boolean supports(MethodParameter returnType, Class<? extends HttpMessageConverter<?>> aClass) {
        // log.debug("结果不 包装处理， 结果{}" );
       return  !(returnType.getParameterType().equals(Response.class)
                || returnType.hasMethodAnnotation(NotResponseWrap.class));
    }

    /**
     * 统一结果包装处理
     * @param data          响应的数据
     * @param returnType    返回的数据类型
     * @param mediaType
     * @param aClass
     * @param request
     * @param response
     * @return
     */
    @Override
    public Object beforeBodyWrite(Object data,
                                  MethodParameter returnType,
                                  MediaType mediaType,
                                  Class<? extends HttpMessageConverter<?>> aClass,
                                  ServerHttpRequest request,
                                  ServerHttpResponse response) {

        // log.debug("统一结果包装处理， 结果{}", data);
        // String类型不能直接包装，所以要进行些特别的处理
        if (returnType.getGenericParameterType().equals(String.class)) {
            ObjectMapper objectMapper = new ObjectMapper();
            try {
                // 将数据包装在Response里后，再转换为json字符串响应给前端,
                // {code: 100, msg: '', data: {hospitalName:'', hospitalLevel:'', ......} }
                return objectMapper.writeValueAsString(new Response<>(data));
            } catch (JsonProcessingException e) {
                log.error("数据转换错误（String->JSON）", e.getMessage());
                // 控制器方法返回 null 自动包装
                throw new APIException(ResultEnum.ERROR);
            }
        }
        // 这里统一包装
        return new Response<>(data);
    }

}