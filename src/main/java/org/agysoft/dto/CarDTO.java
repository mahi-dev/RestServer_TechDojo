package org.agysoft.dto;

import org.agysoft.model.Car;

public record CarDTO(String brand, String model, boolean inStock) {
	public static CarDTO toDto(Car car){
		return new CarDTO(car.getBrand(), car.getModel(), car.isCarInStock());
	}

}
