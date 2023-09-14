package org.agysoft;

import org.agysoft.controller.CarController;
import org.agysoft.repository.CarRepository;
import org.agysoft.service.CarService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Lazy;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan("org.agysoft.model")
@EnableJpaRepositories("org.agysoft.repository")
public class RestApplication {

	@Lazy
	@Bean
	protected CarService carService( final CarRepository repository) {
		return new CarService(repository);
	}

	public static void main(String[] args) {
		SpringApplication.run(RestApplication.class, args);
	}
}
