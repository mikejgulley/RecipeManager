package com.lumatik.app;

import com.lumatik.controller.RecipeDAO;
import com.lumatik.controller.RecipeDAO_InMemImpl;
import com.lumatik.model.Difficulty;
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
public class Main {

    public static void main(String[] args) {
//	    String testRecipeName = "Test Recipe";
//
//        List<String> ingredients = new ArrayList<>();
//	    ingredients.add("Chicken");
//        ingredients.add("Tomatoes");
//        ingredients.add("Basil");
//        ingredients.add("Provolone Cheese");
//        ingredients.add("Olive Oil");
//
//        List<String> directions = new ArrayList<>();
//        directions.add("Grill chicken");
//        directions.add("Cover with Cheese");
//        directions.add("Eat dat food, mang!");
//
//        Recipe testRecipe = new Recipe(0, testRecipeName, ingredients, directions, LocalDate.now());
//
//        testRecipe.setDescription("Super nom nom Chicken Recipe!");
//        testRecipe.setGenre("Italian");
//        testRecipe.setRating(Rating.FIVE_STARS);
//        testRecipe.setDifficulty(Difficulty.MEDIUM);
//
//        System.out.println(testRecipe);


        RecipeDAO recipeDAO = new RecipeDAO_InMemImpl();

        recipeDAO.createRecipe("Test Recipe");
        recipeDAO.createRecipe("Test Recipe 2");
        recipeDAO.createRecipe("Test Recipe 3");
        recipeDAO.createRecipe("Test Recipe 4");
        recipeDAO.createRecipe("Test Recipe 5");

        Map<Integer, Recipe> recipes = new HashMap<>(recipeDAO.getAllRecipes());

        Recipe recipe1 = recipeDAO.getRecipeById(0);
        List<String> ingredients1 = new ArrayList<>();
        ingredients1.add("Snax");
        ingredients1.add("Apples");
        ingredients1.add("Chips");
        recipeDAO.addIngredientsToRecipe(0, ingredients1);

        for (Recipe currentRecipe : recipes.values()) {
            System.out.println(currentRecipe.toString() +'\n' + currentRecipe.getIngredients());
            //System.out.println("Current Recipe ID: " + currentRecipe.getId());
        }
    }
}
