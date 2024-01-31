package com.test.test.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test.test.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
