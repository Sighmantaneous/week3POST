package ie.atu.week3cicdlab;




import jakarta.validation.*;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RequestMapping("/product")
@RestController
public class ProductController {

    //Creating an ArrayList of Products
    List<Product> myList = new ArrayList<>();

    //Test function to ensure Mapping is working
    @GetMapping("/hello")
    public String hello(){
        return "Hello";
    }
    //Displaying all current products
    @GetMapping("/getproduct")
    public List<Product> get_product(){

        return myList;
    }
    //Adding Product to array
    @PostMapping("/addProduct")
    public Product addProduct(@Valid @RequestBody Product myProduct){

        myList.add(myProduct);

        return myProduct;
    }
    //Adding multiply products at a time to array
    @PostMapping("/BulkAddProduct")
    public List<Product> add_bulkProduct(@Valid @RequestBody List <Product> myProducts){
        myList.addAll(myProducts);
        return myList;
    }
    //Getting the amount of products in array
    @GetMapping("/countProduct")
    public int getProductCount(){

        return myList.size();
    }
}
