package com.example.demo.food.Controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.food.Dto.OrderResponse;
import com.example.demo.food.Model.Restaurant;
import com.example.demo.food.Model.customer;
import com.example.demo.food.Repositery.FoodDeliveryFoodItemRepositery;
import com.example.demo.food.Repositery.FoodDeliveryRestaurantRepositery;
import com.example.demo.food.Service.FoodDeliveryService;


@RestController
@RequestMapping("/foodDeliverySystem")
public class FoodDeliveryController {
	
	@Autowired
	private FoodDeliveryService hardCodedListServicen;

	@Autowired
	private FoodDeliveryFoodItemRepositery foodDeliveryFoodItemRepositery;
	
	@Autowired
	private FoodDeliveryRestaurantRepositery foodDeliveryRestaurantRepositery;
	
	/*getAlldata method is called  to get restaurant details for desired location.*/
	@GetMapping("/restaurant/{location}")
    public List<OrderResponse> getAlldata(@PathVariable String location){
		return foodDeliveryRestaurantRepositery.getAllRestaurant(location);
    }
	
	/*addFoodItems method is called to add food items by customer */
	@PostMapping("order/item/add")
	public ResponseEntity<customer> addFoodItems(@RequestBody customer Customer){;
	customer customer1=hardCodedListServicen.saveFoodItems(Customer);
	return new ResponseEntity<customer>(Customer,HttpStatus.OK);
	}

	/*@deleteFoodItems method is called to delete food items by customer */
	@DeleteMapping("order/item/{customerId}")
	public ResponseEntity<Void> deleteFoodItems(@PathVariable int customerId){
	if(hardCodedListServicen.deleteFoodItemsById(customerId)) {
	return ResponseEntity.noContent().build();
	}
	return ResponseEntity.notFound().build();
	}
	
	/*@updateTodos method is called to update food items by customer */
	@PutMapping("order/item/{customerId}")
	public ResponseEntity<customer> updateTodos(@RequestBody customer Customer){;
	customer updateCustomer=hardCodedListServicen.saveFoodItems(Customer);
	return new ResponseEntity<customer>(Customer,HttpStatus.OK);
	}

	/*getAllTodos method is called to get a bill details*/
	@GetMapping("order/item/{customerId}")
	public Map<String,Integer> getAllTodos(@PathVariable int customerId){
	return hardCodedListServicen.getBill(customerId);
	}

}
