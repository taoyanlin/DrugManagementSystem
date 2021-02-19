package com.punguin.drugmanagementsystem.controller;

import com.punguin.drugmanagementsystem.controller.common.BaseController;
import com.punguin.drugmanagementsystem.entity.Drug;
import com.punguin.drugmanagementsystem.entity.common.ResponseResult;
import com.punguin.drugmanagementsystem.model.from.DrugSearchModel;
import com.punguin.drugmanagementsystem.service.DrugService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api("药品类")
@RestController
@RequestMapping("/drug")
public class DrugController extends BaseController {

    @Autowired
    private DrugService drugService;

    @RequestMapping("/findAll")
    public ResponseResult<Drug> findAll(DrugSearchModel searchModel) {

        return new ResponseResult<>();
    }

    @RequestMapping("/addDrug")
    public ResponseResult<String> addDrug(Drug drug) {

        System.out.println("");

        System.out.println(drug.toString());

        return Success("成功");
    }
}
