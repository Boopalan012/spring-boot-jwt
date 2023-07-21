package com.jwt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jwt.Models.Login;

@Repository
public interface LoginRepository extends JpaRepository<Login, Long> {

	Login findByEmail(String email);
}
