package ie.atu.week3cicdlab;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import lombok.*;

@Data
@AllArgsConstructor
public class Product {
    @NotBlank
    private String productName;
    @Positive
    private double price;
}
