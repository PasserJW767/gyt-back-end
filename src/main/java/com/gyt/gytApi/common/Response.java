package com.gyt.gytApi.common;

import lombok.Data;
import lombok.Getter;

@Getter
@Data
public class Response<T> {
    /**
     * 状态码，比如1000代表响应成功
     */
    private int code;

    /**
     * 响应信息，用来说明响应情况
     */
    private String msg;

    /**
     * 响应的具体数据
     */
    private T data;

    /**
     * 默认成功
     * @param data
     */
    public Response(T data) {
        this.code = ResultEnum.SUCCESS.getCode();
        this.msg = ResultEnum.SUCCESS.getMsg();
        this.data = data;
    }

    public Response(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}