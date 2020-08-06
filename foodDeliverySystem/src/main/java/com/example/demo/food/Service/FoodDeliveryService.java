package com.example.demo.food.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.food.Model.customer;
import com.example.demo.food.Repositery.FoodDeliveryFoodItemRepositery;
import com.example.demo.food.Repositery.customerRepository;

@Service
public class FoodDeliveryService {
	@Autowired
	FoodDeliveryFoodItemRepositery foodDeliveryFoodItemRepositery;
	@Autowired
	customerRepository customerRep;
	public customer saveFoodItems(customer Customer) {
		return customerRep.save(Customer);
		 }
		 
    public customer update(customer Customer) {
		Optional<customer> todoOpt=customerRep.findById(Customer.getId());
		if(todoOpt.isPresent()){
			customerRep.deleteById(Customer.getId());
		return customerRep.save(Customer);
		}
		return Customer;
		 }
		 
	public customer findFoodItemsById(Integer id) {
		Optional<customer> opt= customerRep.findById(id);
		 if(opt.isPresent()) {
		return opt.get();
		  }
		         return null;
		    }
		 
    public Boolean deleteFoodItemsById(Integer id) {
		customer Customer=findFoodItemsById(id);
		if(Objects.nonNull(Customer))
		{
		customerRep.deleteById(id);
		return true;
		}
		return false;
		}
	public Map<String,Integer> getBill(int customerid) {
			// While passing customer id List of foodId will be returned.since jdbc is not supported in local i am hard coding here.
//			customer Customer = customerRep.findById(customerid);
			//List<Integer>foodList=foodDeliveryFoodItemRepositery.findById(customerid);
//			List<Integer>foodList=new ArrayList<>();
//			foodList.add(102);
//			foodList.add(103);
//			foodList.add(104);
			//food data from DB
			Map<String,Integer>foodItemListMap=new HashMap<>();
			foodItemListMap.put("dosa", 100);
			foodItemListMap.put("idly", 50);
			foodItemListMap.put("chappathi", 20);
			return foodItemListMap;
			//In client side total amount will be dispalyed
		 }


}
