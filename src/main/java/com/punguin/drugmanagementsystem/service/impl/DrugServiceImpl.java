package com.punguin.drugmanagementsystem.service.impl;

import com.punguin.drugmanagementsystem.entity.Drug;
import com.punguin.drugmanagementsystem.entity.Photo;
import com.punguin.drugmanagementsystem.model.from.DrugSearchModel;
import com.punguin.drugmanagementsystem.model.to.DrugModel;
import com.punguin.drugmanagementsystem.repository.DrugRepository;
import com.punguin.drugmanagementsystem.repository.PhotoRepository;
import com.punguin.drugmanagementsystem.service.DrugService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DrugServiceImpl implements DrugService {

    //dao层 ，之后需要更换成mybatis plus ，所以暂时没有完成

    @Autowired
    private DrugRepository drugRepository;
    @Autowired
    private PhotoRepository photoRepository;

    @Override
    public List<DrugModel> findAllDrugs(DrugSearchModel searchModel) {
        return null;
    }

    @Override
    public DrugModel findById(String id) {

        DrugModel drugModel = new DrugModel();
        Optional<Drug> optional = drugRepository.findById(id);

        if (optional == null) {
            return drugModel;
        }
        
        Drug drug = optional.get();
        /**
         * 缺少照片（需要查询数据库中的对应照片）
         *
         * 查出对应照片后，需要前端发起请求获取照片
         */
        List<Photo> photos = photoRepository.findByMajorKey(drug.getId());

        drugModel.setDrug(drug);
        drugModel.setPhotos(photos);
    return drugModel;
    }

    @Override
    public String deleteDrug(List<String> id) {

        for (String s : id) {
            Optional<Drug> drug = drugRepository.findById(s);
            if (drug.isPresent()){
            }
        }
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
