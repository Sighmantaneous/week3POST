package ie.atu.week3cicdlab;



import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RequestMapping("/product")
@RestController
public class ProductController {

    List<Product> myList = new ArrayList<>();

    @GetMapping("/hello")
    public String hello(){
        return "Hello";
    }

    @GetMapping("/getproduct")
    public Product get_product(){

        Product myProduct = new Product("Fridge", 450);

        return myProduct;
    }
    @PostMapping("/addProduct")
    public Product addProduct(@RequestBody Product myProduct){

        myList.add(myProduct);

        return myProduct;
    }
}
