package com.example.CategoryPutMapping;

import org.springframework.stereotype.Service;
import java.util.HashMap;
import java.util.Map;

@Service
public class CategoryService {
    private Map<Long, Category> categoryMap = new HashMap<>();

    public Category updateCategory(Long id, Category newCategory) {
        if (categoryMap.containsKey(id)) {
            Category category = categoryMap.get(id);
            category.setName(newCategory.getName());
            return category;
        }
        return null; // or throw an exception if the category doesn't exist
    }

    // Dummy method to add categories for testing
    public void addCategory(Category category) {
        categoryMap.put(category.getId(), category);
    }
}
