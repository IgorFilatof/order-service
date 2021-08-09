package com.example.demo;

import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Repository
public class OrderDao {

    public List<Order> getOrders(){
        return Stream.of(
                new Order(101,"Mobile",1,3000),
                new Order(111,"TV",2,36000),
                new Order(121,"Laptop",3,32000))
                .collect(Collectors.toList());
    }
}
