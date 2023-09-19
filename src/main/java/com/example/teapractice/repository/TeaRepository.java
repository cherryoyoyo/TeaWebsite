package com.example.teapractice.repository;

import com.example.teapractice.model.Teaname;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TeaRepository extends JpaRepository<Teaname, Long> {
	List<Teaname> findByName(String name); // 自定義查詢方法
}

