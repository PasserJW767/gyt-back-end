package com.gyt.gytApi.exception;

import com.gyt.gytApi.common.ResultEnum;
import lombok.Getter;

@Getter
public class APIException extends  RuntimeException {
    /**错误代码*/
    private final int code;
    /**错误消息*/
    private final String msg;

    /**
     * @param errorCodeEnum
     */
    public APIException(ResultEnum errorCodeEnum) {
        super(errorCodeEnum.getMsg());
        this.code = errorCodeEnum.getCode();
        this.msg = errorCodeEnum.getMsg();
    }

}