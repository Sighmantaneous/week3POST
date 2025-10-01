package ie.atu.week3cicdlab;

import jakarta.validation.constraints.*;
import lombok.*;

@Data
@AllArgsConstructor
public class Product {
    @NotBlank(message = "Cannot be empty")
    private String productName;
    @Positive
    @NotNull(message="Cannot be negative")
    private double price;
}
