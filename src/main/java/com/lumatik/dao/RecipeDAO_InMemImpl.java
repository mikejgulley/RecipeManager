package com.lumatik.dao;

import com.lumatik.model.Rating;
import com.lumatik.model.Recipe;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by mikejgulley on 5/21/2017.
 */
public class RecipeDAO_InMemImpl implements RecipeDAO {
//    private Map<Integer, Recipe> recipesMap = new HashMap<>();
    private List<Recipe> recipeList = new ArrayList<>();
    private static int counter = 1;

    public Recipe createRecipe(String name) {
        Recipe recipe = new Recipe(counter, name);
        // TODO - Refactor - Map may not be necessary, List might suffice since obj has id
//        recipesMap.put(counter, recipe);
        recipeList.add(recipe);
        counter++;

        return recipe;
    }

    public void addIngredientsToRecipe(int recipeId, List<String> ingredients) {
        getRecipeById(recipeId).setIngredients(ingredients);
    }

    public void addDirectionsToRecipe(int recipeId, List<String> directions) {
        getRecipeById(recipeId).setDirections(directions);
    }

    public List<Recipe> getAllRecipes() {
        return recipeList;
    }

    public List<Recipe> getAllFavoriteRecipes() {
        return null;
    }

    public List<Recipe> getRecipesByDateRange(LocalDate startDate, LocalDate endDate) {
        return null;
    }

    public List<Recipe> getRecipesByDifficulty(String difficulty) {
        return null;
    }

    public List<Recipe> getRecipesByGenre(String genre) {
        return null;
    }

    public List<Recipe> getRecipesByRating(Rating rating) {
        return null;
    }

    public List<Recipe> getRecipesByIngredient(String ingredient) {
        return null;
    }

    public List<Recipe> getRecipesByIngredients(List<String> ingredients) {
        return null;
    }

    public Recipe getRecipeById(int id) {
//        return recipesMap.get(id);
        return recipeList.get(id);
    }

    public Recipe getRecipeByName(String name) {
        return null;
    }

    public void updateRecipe(int recipeId) {

    }

    public void deleteRecipe(int recipeId) {

    }
}
