package com.tensquare.base.controller;

import entity.Result;
import entity.StatusCode;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @program: tensquare-parent
 * @Date: 2019-3-23 11:39
 * @Author: 846602483
 * @Description:统一异常处理类
 */

@RestControllerAdvice
public class BaseExceptionHandler {

    @ExceptionHandler(value = Exception.class)
    public Result exception(Exception e){
        e.printStackTrace();

    return new Result(false, StatusCode.ERROR,e.getMessage());


    }
}
