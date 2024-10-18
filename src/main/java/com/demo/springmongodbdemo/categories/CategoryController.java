package com.demo.springmongodbdemo.categories;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/categories")
@RequiredArgsConstructor
public class CategoryController {

    private final CategoryService categoryService;

    @PostMapping
    public ResponseEntity<String> save(@RequestBody Category category){
        return ResponseEntity.ok(categoryService.save(category));
    }

    @GetMapping
    public ResponseEntity<List<Category>> findAll(){
        return ResponseEntity.ok(categoryService.findAll());
    }

    @GetMapping("/{category_id}")
    public ResponseEntity<Category> findById(@PathVariable("category_id") String id){
        return ResponseEntity.ok(categoryService.findById(id));
    }

    @DeleteMapping("/{category_id}")
    public ResponseEntity<Void> delete(@PathVariable(name = "category_id") String id){
        categoryService.delete(id);
        return ResponseEntity.accepted().build();
    }
}
