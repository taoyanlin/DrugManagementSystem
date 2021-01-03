package com.punguin.drugmanagementsystem.controller;

import com.punguin.drugmanagementsystem.entity.Drug;
import com.punguin.drugmanagementsystem.entity.common.ResponseResult;
import com.punguin.drugmanagementsystem.model.DrugSearchModel;
import com.punguin.drugmanagementsystem.service.DrugService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DrugController {

    @Autowired
    private DrugService drugService;

    public ResponseResult<Drug> findAll(DrugSearchModel searchModel){

        return new ResponseResult<>();
    }
}
