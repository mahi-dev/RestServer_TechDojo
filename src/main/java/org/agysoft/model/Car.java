package org.agysoft.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import lombok.*;
import org.hibernate.annotations.DynamicUpdate;

@Entity
@Data
@NoArgsConstructor(force = true)
@RequiredArgsConstructor
@DynamicUpdate
public class Car {

	@Id
	@GeneratedValue
	@EqualsAndHashCode.Include
	private Long uid;

	@NotBlank
	@NonNull
	private String   brand;

	@NotBlank
	@NonNull
	private String model;

	private final boolean carInStock;

}
