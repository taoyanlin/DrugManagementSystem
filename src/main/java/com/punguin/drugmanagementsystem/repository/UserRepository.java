package com.punguin.drugmanagementsystem.repository;

import com.punguin.drugmanagementsystem.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author ASUS
 */
public interface UserRepository extends JpaRepository<User,String> {
}
