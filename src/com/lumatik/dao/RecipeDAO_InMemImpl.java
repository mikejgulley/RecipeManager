package com.lumatik.dao;

import com.lumatik.model.Rating;
import com.lumatik.model.Recipe;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by mikejgulley on 5/21/2017.
 */
public class RecipeDAO_InMemImpl implements RecipeDAO {
    private Map<Integer, Recipe> recipesMap = new HashMap<>();
    private static int counter = 0;

    @Override
    public void createRecipe(String name) {
        Recipe recipe = new Recipe(counter, name);
        recipe.setCreateDate(LocalDate.now());
        recipesMap.put(counter, recipe);
        counter++;
    }

    @Override
    public void addIngredientsToRecipe(int recipeId, List<String> ingredients) {
        getRecipeById(recipeId).setIngredients(ingredients);
    }

    @Override
    public void addDirectionsToRecipe(int recipeId, List<String> directions) {
        getRecipeById(recipeId).setDirections(directions);
    }

    @Override
    public Map<Integer, Recipe> getAllRecipes() {
        return recipesMap;
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
        return recipesMap.get(id);
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
