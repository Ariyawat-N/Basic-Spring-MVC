package com.example.javabootcamp;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
public class ProductController {


//GET METHOD
    @GetMapping("/api/products")
    public List<Products> getProducts(){
        Products iPhone = new Products("iPhone");
        Products ApppleWatch = new Products("Appple Watch");
        Products apppleTv = new Products("Appple TV");

        return List.of(iPhone,ApppleWatch,apppleTv);
    }

}

// MODEL
class Products {

    private String id = UUID.randomUUID().toString();
    @JsonProperty("product_name")
    private String productName;

    Products(String name) {
        this.productName = name;
    }


    public String getProductName() {
        return productName;
    }

    public String getId() {
        return id;
    }
}
