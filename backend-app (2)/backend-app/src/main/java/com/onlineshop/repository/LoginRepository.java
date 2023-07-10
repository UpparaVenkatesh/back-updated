package com.onlineshop.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.onlineshop.bean.Login;

public interface LoginRepository extends JpaRepository<Login, String>{

}
