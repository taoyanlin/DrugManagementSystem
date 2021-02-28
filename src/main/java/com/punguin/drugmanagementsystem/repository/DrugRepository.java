package com.punguin.drugmanagementsystem.repository;

import com.punguin.drugmanagementsystem.entity.Drug;
import org.springframework.data.jpa.repository.JpaRepository;


public interface DrugRepository extends JpaRepository<Drug,String> {
    Drug findByApprovalNumber(String approvalNumber);
}
