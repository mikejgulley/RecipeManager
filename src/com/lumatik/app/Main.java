package com.lumatik.app;

import com.lumatik.dao.RecipeDAO;
import com.lumatik.dao.RecipeDAO_InMemImpl;
import com.lumatik.model.Difficulty;
import com.lumatik.model.Rating;
import com.lumatik.model.Recipe;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by mikejgulley on 5/21/2017.
 */
public class Main {

    public static void main(String[] args) {
        RecipeDAO recipeDAO = new RecipeDAO_InMemImpl();

        recipeDAO.createRecipe("Test Recipe");
        recipeDAO.createRecipe("Test Recipe 2");
//        recipeDAO.createRecipe("Test Recipe 3");
//        recipeDAO.createRecipe("Test Recipe 4");
//        recipeDAO.createRecipe("Test Recipe 5");

        Map<Integer, Recipe> recipes = new HashMap<>(recipeDAO.getAllRecipes());

        Recipe recipe1 = recipeDAO.getRecipeById(0);
        List<String> ingredients1 = new ArrayList<>();
        ingredients1.add("Snax");
        ingredients1.add("Apples");
        ingredients1.add("Chips");
        recipe1.setDifficulty(Difficulty.MEDIUM);
        recipe1.setRating(Rating.FOUR_STARS);
        recipeDAO.addIngredientsToRecipe(0, ingredients1);

        Recipe recipe2 = recipeDAO.getRecipeById(1);
        List<String> ingredients2 = new ArrayList<>();
        ingredients2.add("Cracker Jax");
        ingredients2.add("Water");
        ingredients2.add("Curry");
        //recipe2.setDifficulty(Difficulty.EASY);
        recipe2.setRating(Rating.FIVE_STARS);
        recipeDAO.addIngredientsToRecipe(1, ingredients2);

        for (Recipe currentRecipe : recipes.values()) {
            System.out.println(currentRecipe.toString() +'\n' + currentRecipe.getIngredients());
            //System.out.println("Current Recipe ID: " + currentRecipe.getId());
        }
    }
}
