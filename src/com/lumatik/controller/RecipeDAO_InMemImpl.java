package com.lumatik.controller;

import com.lumatik.model.Rating;
import com.lumatik.model.Recipe;

import java.time.LocalDate;
import java.util.List;

/**
 * Created by mikejgulley on 5/21/2017.
 */
public class RecipeDAO_InMemImpl implements RecipeDAO {
    @Override
    public void createRecipe(String name) {

    }

    @Override
    public List<Recipe> getAllRecipes() {
        return null;
    }

    @Override
    public List<Recipe> getAllFavoriteRecipes() {
        return null;
    }

    @Override
    public List<Recipe> getRecipesByDateRange(LocalDate startDate, LocalDate endDate) {
        return null;
    }

    @Override
    public List<Recipe> getRecipesByDifficulty(String difficulty) {
        return null;
    }

    @Override
    public List<Recipe> getRecipesByGenre(String genre) {
        return null;
    }

    @Override
    public List<Recipe> getRecipesByRating(Rating rating) {
        return null;
    }

    @Override
    public List<Recipe> getRecipesByIngredient(String ingredient) {
        return null;
    }

    @Override
    public List<Recipe> getRecipesByIngredients(List<String> ingredients) {
        return null;
    }

    @Override
    public Recipe getRecipeById(int id) {
        return null;
    }

    @Override
    public Recipe getRecipeByName(String name) {
        return null;
    }

    @Override
    public void updateRecipe(int recipeId) {

    }

    @Override
    public void deleteRecipe(int recipeId) {

    }
}
