package com.zhiqiang.mall.commonbean;

import jdk.net.SocketFlow;

/**
 * @ClassName: CommonResult
 * @description: 通用返回对象
 * @author: zhiqiang
 * @create: 2020/4/21 20:13
 */
public class CommonResult<T> {
    private int code;
    private String message;
    private T result_data;

    protected CommonResult(){}

    protected CommonResult(int code, String message, T result_data) {
        this.code = code;
        this.message = message;
        this.result_data = result_data;
    }

    /**
     * @description: 返回成功结果(自定义消息）
     * @param:* @param result_data  数据
     * @param message   提示信息
     * @return: com.zhiqiang.mall.commonbean.CommonResult<T>
     * @author: zhiqiang
     * @time: 2020/4/21 20:35
     */
    public static <T> CommonResult<T> success(T result_data,String message)
    {
        return new CommonResult<T>(Code.SUCCESS.getCode(), message, result_data);
    }

    /**
     * @description: 返回成功结果
     * @param:data  数据
     * @return: com.zhiqiang.mall.commonbean.CommonResult<T>
     * @author: zhiqiang
     * @time: 2020/4/21 20:38
     */
    public static <T> CommonResult<T> success(T data)
    {
        return new CommonResult<T>(Code.SUCCESS.getCode(), Code.SUCCESS.getMessage(), data);
    }

    /**
     * @description: 返回失败结果
     * @param:* @param errorCode
     * @return: com.zhiqiang.mall.commonbean.CommonResult<T>
     * @author: zhiqiang
     * @time: 2020/4/21 20:43
     */
    public static <T> CommonResult<T> failed(Code errorCode) {
        return new CommonResult<T>(errorCode.getCode(), errorCode.getMessage(), null);
    }

    //返回失败结果，含消息参数
    public static <T> CommonResult<T> failed(Code errorCode,String message) {
        return new CommonResult<T>(errorCode.getCode(), message, null);
    }
    //返回失败结果，仅含提示信息
    public static <T> CommonResult<T> failed(String message) {
        return new CommonResult<T>(Code.FAILED.getCode(), message, null);
    }
    //返回失败结果，没有参数
    public static <T> CommonResult<T> failed() {
        return failed(Code.FAILED);
    }

    //参数验证失败
    public static <T> CommonResult<T> validateFailed() {
        return failed(Code.VALIDATE_FAILED);
    }
    public static <T> CommonResult<T> validateFailed(String message) {
        return new CommonResult<T>(Code.VALIDATE_FAILED.getCode(), message, null);
    }

    //未登录或者token过期
    public static <T> CommonResult<T> unauthorized(T data) {
        return new CommonResult<T>(Code.UNAUTHORIZED.getCode(), Code.UNAUTHORIZED.getMessage(), data);
    }

    //未授权
    public static <T> CommonResult<T> forbidden(T data) {
        return new CommonResult<T>(Code.FORBIDDEN.getCode(), Code.FORBIDDEN.getMessage(), data);
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getResult_data() {
        return result_data;
    }

    public void setResult_data(T result_data) {
        this.result_data = result_data;
    }
}
