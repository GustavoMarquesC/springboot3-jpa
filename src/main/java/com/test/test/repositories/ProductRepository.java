package com.test.test.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test.test.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
