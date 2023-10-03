package com.jts.springboot.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.jts.springboot.entity.Order;
import com.jts.springboot.entity.Products;

public interface ProductRepository extends JpaRepository<Products, Long> {

	@Query("select p from Products p where p.description like '%test%'")
	List<Products> findAllProductWithDescription();
	
	@Query(nativeQuery = true, value = "select * from Products p where p.description like '%test%'")
	List<Products> findAllProductWithDescriptionWithNativeQuery();
	
	@Query("select p from Products p where p.description IN (:descrption)")
	List<Products> findAllProductWithDescriptionWithParam(@Param("descrption") List<String> descrption);
	
	@Query("select count(1) from Products p GROUP BY p.description")
	List<String> findAllProductById();
	
	@Query("select p from Products p order by p.name desc")
	List<Products> findAllProductWithOrder();
	
	@Query("select o from Order o JOIN o.product")
	List<Order> findOrder();
}
