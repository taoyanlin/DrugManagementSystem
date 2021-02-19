package com.punguin.drugmanagementsystem.service;

import com.punguin.drugmanagementsystem.entity.Drug;
import com.punguin.drugmanagementsystem.exception.SystemException;
import com.punguin.drugmanagementsystem.model.from.DrugSearchModel;
import com.punguin.drugmanagementsystem.model.to.DrugModel;

import java.util.List;

public interface DrugService {

    /**
     * 查询所有的药品信息（考虑到多条件查询，暂时未做处理）
     * @return 药品集合
     */
    List<DrugModel> findAllDrugs(DrugSearchModel searchModel);

    /**
     * 查找某个药品的详细信息
     * @param id 药品的ID
     * @return 药品的详细信息
     */
    DrugModel findById(String id);

    /**
     * 删除药品信息（考虑软删除还是硬删除）
     * @param id 药品的ID
     * @return 成功或者失败
     */
    String deleteDrug(List<String> id) throws SystemException;

    /**
     * 修改药品信息
     * @param drug 传入药品的参数
     * @return 返回成功或者失败
     */
    String modifyDrug(Drug drug);

    /**
     * 上传药品的照片（等前端确定好参数）
     * @return
     */
    String upLoadDrugPhoto();

    /**
     * 新建药品信息
     * @param drug 药品信息
     * @return 成功或者失败
     */
    void saveDrug(Drug drug);

}
