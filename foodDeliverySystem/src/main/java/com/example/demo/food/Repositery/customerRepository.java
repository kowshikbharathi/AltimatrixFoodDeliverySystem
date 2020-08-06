package com.example.demo.food.Repositery;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.food.Model.customer;

public interface customerRepository  extends JpaRepository<customer, Integer>{

}
