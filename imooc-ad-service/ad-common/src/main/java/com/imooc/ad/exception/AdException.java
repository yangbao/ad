package com.imooc.ad.exception;

/**
 * 自定义异常类, 可以以后扩展
 */
public class AdException extends  Exception{

    public AdException(String message) {
        super(message);
    }
}
