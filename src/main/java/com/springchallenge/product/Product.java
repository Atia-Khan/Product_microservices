package com.springchallenge.product;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity (name= "Products")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor



public class Product {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
   private Integer Id;

   private String name;
   private Integer quantity;
   private Integer price;

    // public Product(long Id, String name, int quantity, float price){
    //     this.Id = Id;
    //     this.name = name;
    //     this.quantity = quantity;
    //     this.price = price;
    // }

   
}
