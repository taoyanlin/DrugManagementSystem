package com.punguin.drugmanagementsystem.model.to;

import com.punguin.drugmanagementsystem.entity.Drug;
import com.punguin.drugmanagementsystem.entity.Photo;

import java.util.List;

/**
 * 返回给前端的模型
 */
public class DrugModel {
    private Drug drug;

    private List<Photo> photos;

    public Drug getDrug() {
        return drug;
    }

    public void setDrug(Drug drug) {
        this.drug = drug;
    }

    public List<Photo> getPhotos() {
        return photos;
    }

    public void setPhotos(List<Photo> photos) {
        this.photos = photos;
    }
}
