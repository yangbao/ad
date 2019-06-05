package com.imooc.ad.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data //get,set
@NoArgsConstructor // 无参数构造
@AllArgsConstructor //全参数构造
public class CommonResponse<T> implements Serializable{

    private Integer code;

    private String message;

    private T data;

    public CommonResponse(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
