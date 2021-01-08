package com.punguin.drugmanagementsystem.repository;

import com.punguin.drugmanagementsystem.entity.Photo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PhotoRepository extends JpaRepository<Photo,String> {
    List<Photo> findByMajorKey(String majorKey);
}
