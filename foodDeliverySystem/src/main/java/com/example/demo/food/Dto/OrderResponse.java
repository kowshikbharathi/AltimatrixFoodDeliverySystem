package com.example.demo.food.Dto;

public class OrderResponse {
	private String resturantName;
	private String resturantLocation;
	private float resturantRating;
	private String foodName;
	private String foodRate;
	
	public OrderResponse() {
		
	}

	@Override
	public String toString() {
		return "OrderResponse [resturantName=" + resturantName + ", resturantLocation=" + resturantLocation
				+ ", resturantRating=" + resturantRating + ", foodName=" + foodName + ", foodRate=" + foodRate + "]";
	}

	public OrderResponse(String resturantName, String resturantLocation, float resturantRating, String foodName,
			String foodRate) {
		super();
		this.resturantName = resturantName;
		this.resturantLocation = resturantLocation;
		this.resturantRating = resturantRating;
		this.foodName = foodName;
		this.foodRate = foodRate;
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
	
}
