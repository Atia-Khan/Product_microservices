package com.springchallenge.product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface IProductRepository extends JpaRepository<Product, Long> {

    Product findByName(String name);

 

    

    
    

}
