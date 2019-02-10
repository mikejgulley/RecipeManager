package com.lumatik.controller;

import com.lumatik.model.Recipe;

import java.util.List;

public interface RecipeController {
    Recipe addRecipe();
    Recipe getRecipeById(int id);
    List<Recipe> getAllRecipes();
    Recipe updateRecipe();
    Recipe deleteRecipe();
}
