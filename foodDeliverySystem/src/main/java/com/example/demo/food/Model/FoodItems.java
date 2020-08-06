package com.example.demo.food.Model;


import javax.persistence.Entity;

import javax.persistence.Id;

@Entity
public class FoodItems {
	@Id
	private int foodId;
	private String foodName;
	private String foodRate;
	
	public FoodItems() {
		
	}

	public int getFoodId() {
		return foodId;
	}

	public void setFoodId(int foodId) {
		this.foodId = foodId;
	}

	public String getFoodName() {
		return foodName;
	}

	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}

	public String getFoodRate() {
		return foodRate;
	}

	public void setFoodRate(String foodRate) {
		this.foodRate = foodRate;
	}

	@Override
	public String toString() {
		return "FoodItems [foodId=" + foodId + ", foodName=" + foodName + ", foodRate=" + foodRate + "]";
	}

	public FoodItems(int foodId, String foodName, String foodRate) {
		super();
		this.foodId = foodId;
		this.foodName = foodName;
		this.foodRate = foodRate;
	}
	
}
