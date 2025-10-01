package ie.atu.week3cicdlab;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import lombok.*;

@Data
@AllArgsConstructor
public class Product {
    @NotBlank(message = "Cannot be empty")
    private String productName;
    @Positive(message ="Cannot be negative")
    private double price;
}
