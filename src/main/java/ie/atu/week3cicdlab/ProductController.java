package ie.atu.week3cicdlab;



import com.fasterxml.jackson.core.JsonGenerationException;
import jakarta.validation.*;
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
    public List<Product> get_product(){

        Product myProduct = new Product("Fridge", 450);

        return myList;
    }
    @PostMapping("/addProduct")
    public Product addProduct(@Valid @RequestBody Product myProduct){

        myList.add(myProduct);

        return myProduct;
    }
    @PostMapping("/BulkAddProduct")
    public List<Product> add_bulkProduct(@Valid @RequestBody List<Product> myList){

        return myList;
    }
}
