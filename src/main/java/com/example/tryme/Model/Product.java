package com.example.tryme.Model;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private Integer caloriesPer100g;

    @OneToMany(mappedBy = "product")
    private List<MealProduct> mealProducts;

    public Product() {}

    public Product(String name, Integer caloriesPer100g) {
        this.name = name;
        this.caloriesPer100g = caloriesPer100g;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public Integer getCaloriesPer100g() { return caloriesPer100g; }
    public void setCaloriesPer100g(Integer caloriesPer100g) { this.caloriesPer100g = caloriesPer100g; }
    public List<MealProduct> getMealProducts() { return mealProducts; }
    public void setMealProducts(List<MealProduct> mealProducts) { this.mealProducts = mealProducts; }
}