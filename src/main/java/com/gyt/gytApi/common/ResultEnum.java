package com.gyt.gytApi.common;

import lombok.Getter;

/**
 * 错误码枚举
 */
@Getter
public enum ResultEnum {
    SUCCESS(200, "成功"),
    FAILED(500, "响应失败"),
    ERROR(501, "未知错误"),
    VALIDATE_FAILED(503, "参数校验失败"),
    NULL_VALUE(502, "结果错误：null");

    /**错误号*/
    private final Integer code;
    /**错误消息*/
    private final String msg;

    ResultEnum(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

}