package org.agysoft.controller;

import lombok.RequiredArgsConstructor;
import org.agysoft.dto.CarDTO;
import org.agysoft.model.Car;
import org.agysoft.service.CarService;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/api")
public record CarController(CarService service ) {

	@PostMapping("/car")
	public boolean createEntity(@RequestBody CarDTO carDTO){
		final var entity = new Car(carDTO.brand(), carDTO.model(), carDTO.inStock());
		return  service.createEntity(entity);
	}

	@GetMapping("/car")
	public boolean createEntity(@RequestParam String brand, @RequestParam String model, @RequestParam boolean inStock) {
		final var entity = new Car(brand, model, inStock);
		return service.createEntity(entity);
	}

	@GetMapping("/car/list")
	public Collection<CarDTO> getEntities() {
		return service.listCars().stream().map(CarDTO::toDto).toList();
	}

	@GetMapping("/car/list/{brand}")
	public Collection<CarDTO> getCars(@PathVariable final String brand) {
		return service.getCars(brand).stream().map(CarDTO::toDto).toList();
	}

	@GetMapping("/car/stock/list")
	public Collection<CarDTO> getCars() {
		return service.getCarsInStock().stream().map(CarDTO::toDto).toList();
	}

}
