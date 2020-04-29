package com.zhiqiang.mall.exception;

import com.zhiqiang.mall.commonbean.Code;

/**
 * @ClassName: 自定义异常
 * @description: TODO
 * @author: zhiqiang
 * @create: 2020/4/24 18:19
 */
public class ApiException extends RuntimeException {
    private Code errorCode;

    public ApiException(Code errorCode) {
        super(errorCode.getMessage());
        this.errorCode = errorCode;
    }

    public ApiException(String message) {
        super(message);
    }

    public ApiException(Throwable cause) {
        super(cause);
    }

    public ApiException(String message, Throwable cause) {
        super(message, cause);
    }

    public Code getErrorCode() {
        return errorCode;
    }
}
