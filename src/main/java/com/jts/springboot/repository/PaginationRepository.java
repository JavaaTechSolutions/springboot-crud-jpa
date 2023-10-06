package com.jts.springboot.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.jts.springboot.entity.Products;

public interface PaginationRepository extends PagingAndSortingRepository<Products, Long> {
	Page<Products> findAll(Pageable pageable);
	
	Page<Products> findAll(Sort srt);
}
