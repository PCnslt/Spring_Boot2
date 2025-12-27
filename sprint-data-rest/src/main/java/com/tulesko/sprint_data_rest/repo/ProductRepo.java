package com.tulesko.sprint_data_rest.repo;

import com.tulesko.sprint_data_rest.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepo extends JpaRepository<Product, Integer> {

}
