package com.demo.springmongodbdemo.categories;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CategoryService {

    private final CategoryRepository categoryRepository;

    public String save(Category category){
        //todo use a DTO
        //todo validate the objects
        return categoryRepository.save(category).getId();
    }

    public Category findById(String id){
        return categoryRepository.findById(id)
                .orElse(null);
    }

    public List<Category> findAll(){
        return categoryRepository.findAll();
    }

    public void delete(String id){
        categoryRepository.deleteById(id);
    }
}
