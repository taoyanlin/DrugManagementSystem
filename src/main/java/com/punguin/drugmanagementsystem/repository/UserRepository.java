package com.punguin.drugmanagementsystem.repository;

import com.punguin.drugmanagementsystem.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author ASUS
 */
public interface UserRepository extends JpaRepository<User,String> {
    List<User> findByUsername(String username);
}
