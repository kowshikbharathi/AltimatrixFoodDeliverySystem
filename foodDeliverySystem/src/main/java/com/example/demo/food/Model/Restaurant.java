package com.example.demo.food.Model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Restaurant { 
	@Id	
	private int restaurantId;
	private String resturantName;
	private String resturantLocation;
	private float resturantRating;
	@OneToMany(targetEntity = FoodItems.class,cascade = CascadeType.ALL)
	@JoinColumn(name="cp_fk",referencedColumnName = "restaurantId")
	private List<FoodItems> fooditems;
	
	public Restaurant() {
		
	}

	public int getRestaurantId() {
		return restaurantId;
	}

	public void setRestaurantId(int restaurantId) {
		this.restaurantId = restaurantId;
	}

	public String getResturantName() {
		return resturantName;
	}

	public void setResturantName(String resturantName) {
		this.resturantName = resturantName;
	}

	public String getResturantLocation() {
		return resturantLocation;
	}

	public void setResturantLocation(String resturantLocation) {
		this.resturantLocation = resturantLocation;
	}

	public float getResturantRating() {
		return resturantRating;
	}

	public void setResturantRating(float resturantRating) {
		this.resturantRating = resturantRating;
	}

	public List<FoodItems> getFooditems() {
		return fooditems;
	}

	public void setFooditems(List<FoodItems> fooditems) {
		this.fooditems = fooditems;
	}

	public Restaurant(int restaurantId, String resturantName, String resturantLocation, float resturantRating,
			List<FoodItems> fooditems) {
		super();
		this.restaurantId = restaurantId;
		this.resturantName = resturantName;
		this.resturantLocation = resturantLocation;
		this.resturantRating = resturantRating;
		this.fooditems = fooditems;
	}

	@Override
	public String toString() {
		return "Restaurant [restaurantId=" + restaurantId + ", resturantName=" + resturantName + ", resturantLocation="
				+ resturantLocation + ", resturantRating=" + resturantRating + ", fooditems=" + fooditems + "]";
	}
	
}
