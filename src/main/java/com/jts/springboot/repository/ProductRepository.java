package com.jts.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jts.springboot.entity.Products;

public interface ProductRepository extends JpaRepository<Products, Long> {

}
