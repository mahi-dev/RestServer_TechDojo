package org.agysoft.service;

import org.agysoft.model.Car;
import org.agysoft.repository.CarRepository;

import java.util.Collection;

public record CarService(CarRepository repository)  {

	public boolean createEntity(final Car entity) {
		return entity.equals(repository.saveAndFlush(entity));
	}
	public Collection<Car> listCars(){
		return repository.findAll();
	}

	public Collection<Car> getCars(final String brand){
		return  repository.findByBrand(brand);
	}

	public Collection<Car> getCarsInStock(){
		return  repository.findByCarInStockTrue();
	}
}
