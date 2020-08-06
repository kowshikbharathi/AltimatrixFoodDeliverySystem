package com.example.demo.food.Repositery;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.food.Dto.OrderResponse;
import com.example.demo.food.Model.Restaurant;
import com.sun.xml.bind.v2.runtime.Location;

@Repository
@EnableJpaRepositories
public interface FoodDeliveryRestaurantRepositery extends JpaRepository<Restaurant, Integer>{
	//public static final String location = "";
	@Query("SELECT new com.example.demo.food.Dto.OrderResponse(r.resturantName , r.resturantLocation , r.resturantRating , f.foodName , f.foodRate) FROM Restaurant r JOIN r.fooditems f")	
	public List<OrderResponse> getAllRestaurant(String location);
	
	
}
