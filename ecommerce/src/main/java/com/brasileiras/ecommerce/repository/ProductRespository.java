package com.brasileiras.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.brasileiras.ecommerce.Product;

public interface ProductRespository extends JpaRepository<Product, Long>{

}
