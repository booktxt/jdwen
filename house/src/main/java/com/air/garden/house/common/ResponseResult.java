package com.air.garden.house.common;

import lombok.Data;

import java.io.Serializable;

/**
 * @author wenjd
 * @date 2018/12/13
 */
@Data
public class ResponseResult implements Serializable {

    private final static String SUCCESS_CODE = "200";

    /**
     * 返回状态码
     */
    private String status;

    /**
     * 返回消息
     */
    private String message;

    /**
     * 返回内容
     */
    private Object data;

    public ResponseResult(Object data) {
        this.status = SUCCESS_CODE;
        this.message = "success";
        this.data = data;
    }

    public ResponseResult(String status, String message, Object data) {
        this.status = status;
        this.message = message;
        this.data = data;
    }

    public ResponseResult(String status, String message) {
        this.status = status;
        this.message = message;
    }


    public static ResponseResult success(Object result) {
        return new ResponseResult(result);
    }


    public static ResponseResult fail(HttpStatus httpStatus, String message) {
        return new ResponseResult(httpStatus.toString(), message);
    }
}
