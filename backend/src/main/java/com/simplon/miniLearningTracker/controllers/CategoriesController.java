package com.simplon.miniLearningTracker.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.simplon.miniLearningTracker.models.Category;
import com.simplon.miniLearningTracker.services.CategoryService;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.jspecify.annotations.NonNull;

@RestController
@RequestMapping("/api/categories")
public class CategoriesController {

    private CategoryService categoryService;

    public CategoriesController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @GetMapping()
    public List<Category> getCategories() {
        return this.categoryService.findAll();
    }

    @PostMapping()
    public ResponseEntity<@NonNull Category> createCategory(@RequestBody Category category) {
        Category categoryCreated = this.categoryService.create(category);
        return new ResponseEntity<@NonNull Category>(categoryCreated, HttpStatus.CREATED);
    }

}
