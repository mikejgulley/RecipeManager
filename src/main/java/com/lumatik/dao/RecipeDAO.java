package com.lumatik.dao;

import com.lumatik.model.Rating;
import com.lumatik.model.Recipe;

import java.time.LocalDate;
import java.util.List;

/**
 * Created by mikejgulley on 5/21/2017.
 */
public interface RecipeDAO {
    Recipe createRecipe(String name);
    void addIngredientsToRecipe(int recipeId, List<String> ingredients);
    void addDirectionsToRecipe(int recipeId, List<String> directions);
    //List<Recipe> getAllRecipes();
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
    void updateRecipe(Recipe recipe);
    void deleteRecipe(int recipeId);
}
