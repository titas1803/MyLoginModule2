package com.cg.login.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.login.entity.Login;

@Repository
public interface ILoginDao extends JpaRepository<Login, Integer> {

}
