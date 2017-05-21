package com.lumatik.controller;

import com.lumatik.model.Rating;
import com.lumatik.model.Recipe;

import java.time.LocalDate;
import java.util.List;

/**
 * Created by mikejgulley on 5/21/2017.
 */
public interface RecipeDAO {
    void createRecipe(String name);
    List<Recipe> getAllRecipes();
    List<Recipe> getAllFavoriteRecipes();
    List<Recipe> getRecipesByDateRange(LocalDate startDate, LocalDate endDate);
    List<Recipe> getRecipesByDifficulty(String difficulty);
    List<Recipe> getRecipesByGenre(String genre);
    List<Recipe> getRecipesByRating(Rating rating);
    List<Recipe> getRecipesByIngredient(String ingredient);
    List<Recipe> getRecipesByIngredients(List<String> ingredients);
    Recipe getRecipeById(int id);
    Recipe getRecipeByName(String name);
    void updateRecipe(int recipeId);
    void deleteRecipe(int recipeId);
}