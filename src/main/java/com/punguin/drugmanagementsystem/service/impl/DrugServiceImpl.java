package com.punguin.drugmanagementsystem.service.impl;

import com.punguin.drugmanagementsystem.entity.Drug;
import com.punguin.drugmanagementsystem.model.DrugSearchModel;
import com.punguin.drugmanagementsystem.service.DrugService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DrugServiceImpl implements DrugService {

    //dao层 ，之后需要更换成mybatis plus ，所以暂时没有完成

    @Override
    public List<Drug> findAllDrugs(DrugSearchModel searchModel) {
        return null;
    }

    @Override
    public Drug findById(String id) {
        return null;
    }

    @Override
    public String deleteDrug(List<String> id) {
        return null;
    }

    @Override
    public String modifyDrug(Drug drug) {
        return null;
    }

    @Override
    public String upLoadDrugPhoto() {
        return null;
    }

    @Override
    public String saveDrug(Drug drug) {
        return null;
    }
}
