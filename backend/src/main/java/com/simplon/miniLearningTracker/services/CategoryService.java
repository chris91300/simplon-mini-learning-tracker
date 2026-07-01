package com.simplon.miniLearningTracker.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.simplon.miniLearningTracker.models.Category;
import com.simplon.miniLearningTracker.repositories.CategoryRepository;

@Service
public class CategoryService {

    private CategoryRepository categoryRepository;

    public CategoryService(CategoryRepository categoryRepository){
        this.categoryRepository = categoryRepository;
    }

    public List<Category> findAll(){
        return this.categoryRepository.findAll();
    }

    public Category create(Category category){
        return this.categoryRepository.save(category);
    }
}
