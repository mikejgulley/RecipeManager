package com.lumatik.dao;

import com.lumatik.model.Rating;
import com.lumatik.model.Recipe;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by mikejgulley on 5/21/2017.
 */
public class RecipeDAO_InMemImpl implements RecipeDAO {
    private Map<Integer, Recipe> recipeMap = new HashMap<>();
    //private List<Recipe> recipeList = new ArrayList<>();
    private int counter = 0;

    public Recipe createRecipe(String name) {
        Recipe recipe = new Recipe(counter, name);
        // TODO - Refactor - Map may not be necessary, List might suffice since obj has id
        recipeMap.put(counter, recipe);
        //recipeList.add(recipe);
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
        return new ArrayList<>(recipeMap.values());
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
        return recipeMap.get(id);
        //return recipeList.get(id);
    }

    // TODO - limit to unique name, only one result else throw exception
    public Recipe getRecipeByName(String name) {
        //recipeList.stream().filter(recipe -> recipe.getName().equals(name)).collect(Collectors.toList());

        for (Recipe currentRecipe : recipeMap.values()) {
            if (currentRecipe.getName().equals(name)) {
                return currentRecipe;
            }
        }

        return null;
    }

    public void updateRecipe(Recipe updatedRecipe) {
        updatedRecipe.setLastUpdatedDate(LocalDate.now());
        recipeMap.put(updatedRecipe.getId(), updatedRecipe);
    }

    public void deleteRecipe(int recipeId) {
        recipeMap.remove(recipeId);
    }
}
