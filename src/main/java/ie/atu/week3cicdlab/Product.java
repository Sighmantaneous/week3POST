package ie.atu.week3cicdlab;

import jakarta.validation.constraints.*;
import lombok.*;

@Data
@AllArgsConstructor
public class Product {
    @NotBlank(message = "Cannot be empty")
    private String productName;
    @Positive
    @Min(value = 5, message = "Price cannot be lower than 5 euro")
    @NotNull(message="Cannot be negative")
    private double price;
}
