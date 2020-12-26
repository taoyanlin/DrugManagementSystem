package com.punguin.drugmanagementsystem.controller.common;


import com.punguin.drugmanagementsystem.entity.common.ResponseResult;

/**
 * @author ASUS
 */
public class BaseController {

    private Integer success = 200;
    private String message = "成功";

    private Integer error = 400;
    private String errorMessage = "失败";

    protected <T> ResponseResult<T> Success(T data){
        ResponseResult responseResult = new ResponseResult();
        responseResult.setState(success);
        responseResult.setMessage(message);
        responseResult.setData(data);
        return responseResult;
    }

    protected <T> ResponseResult<T> Error(T data){
        ResponseResult responseResult = new ResponseResult();
        responseResult.setState(error);
        responseResult.setMessage(errorMessage);
        responseResult.setData(data);
        return responseResult;
    }

}
