package com.imooc.ad.advice;

import com.imooc.ad.exception.AdException;
import com.imooc.ad.vo.CommonResponse;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletRequest;

/**
 * 对异常的统一处理
 */
@RestControllerAdvice
public class GlobalExceptionAdvice {

    //异常也用统一的响应处理, 之处理AdException的异常
    @ExceptionHandler(value = AdException.class)
    public CommonResponse<String> handlerAdException(HttpServletRequest req,
                                                     AdException ex) {
        CommonResponse<String> response = new CommonResponse<>(-1,"business error");
        response.setData(ex.getMessage());

        return response;
    }
}
