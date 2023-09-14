package org.agysoft.repository;

import org.agysoft.model.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collection;

@Transactional
@Repository
public interface CarRepository extends JpaRepository<Car, Long> {
	Collection<Car> findByBrand(String brand);

	Collection<Car> findByCarInStockTrue();
}
