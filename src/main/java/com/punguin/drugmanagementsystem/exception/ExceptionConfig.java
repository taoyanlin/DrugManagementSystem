package com.punguin.drugmanagementsystem.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * @author ASUS
 * 全局处理异常
 */
@ControllerAdvice
public class ExceptionConfig {

    @ExceptionHandler(value = Exception.class)
    public String exceptionHandler(Exception e) {
        if (e instanceof Exception){

        }
        System.out.println("未知异常！原因是:" + e);
        return e.getMessage();
    }
}
