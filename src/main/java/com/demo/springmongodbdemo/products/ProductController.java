package com.demo.springmongodbdemo.products;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/products")
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;

    @PostMapping
    public ResponseEntity<String> save(@RequestBody Product product){
        return ResponseEntity.ok(productService.save(product));
    }

    @GetMapping
    public ResponseEntity<List<Product>> findAll(){
        return ResponseEntity.ok(productService.findAll());
    }

    @GetMapping("/{product_id}")
    public ResponseEntity<Product> findById(@PathVariable("product_id") String id){
        return ResponseEntity.ok(productService.findById(id));
    }

    @DeleteMapping("/{product_id}")
    public ResponseEntity<Void> delete(@PathVariable(name = "product_id") String id){
        productService.delete(id);
        return ResponseEntity.accepted().build();
    }
}
