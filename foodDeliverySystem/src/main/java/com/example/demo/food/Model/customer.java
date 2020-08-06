package com.example.demo.food.Model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

import javax.persistence.Id;

@Entity

public class customer {
    @Id
    @GeneratedValue
    private int id;
private int customerId;
private String customerName;
private int restaurantId;
private int foodId;
private int foodQuantity;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public int getCustomerId() {
	return customerId;
}
public void setCustomerId(int customerId) {
	this.customerId = customerId;
}
public String getCustomerName() {
	return customerName;
}
public void setCustomerName(String customerName) {
	this.customerName = customerName;
}
public int getRestaurantId() {
	return restaurantId;
}
public void setRestaurantId(int restaurantId) {
	this.restaurantId = restaurantId;
}
public int getFoodId() {
	return foodId;
}
public void setFoodId(int foodId) {
	this.foodId = foodId;
}
public int getFoodQuantity() {
	return foodQuantity;
}
public void setFoodQuantity(int foodQuantity) {
	this.foodQuantity = foodQuantity;
}
@Override
public String toString() {
	return "customer [id=" + id + ", customerId=" + customerId + ", customerName=" + customerName + ", restaurantId="
			+ restaurantId + ", foodId=" + foodId + ", foodQuantity=" + foodQuantity + "]";
}
public customer(int id, int customerId, String customerName, int restaurantId, int foodId, int foodQuantity) {
	super();
	this.id = id;
	this.customerId = customerId;
	this.customerName = customerName;
	this.restaurantId = restaurantId;
	this.foodId = foodId;
	this.foodQuantity = foodQuantity;
}
public customer() {
	
}

}

