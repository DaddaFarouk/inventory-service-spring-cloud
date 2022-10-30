package com.farouk.inventoryservice.repositories;

import com.farouk.inventoryservice.entities.Product;
import org.springframework.boot.json.JacksonJsonParser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
