package com.lumatik.app;

import com.lumatik.model.Difficulty;
import com.lumatik.model.Rating;
import com.lumatik.model.Recipe;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by mikejgulley on 5/21/2017.
 */
public class Main {

    public static void main(String[] args) {
	    String testRecipeName = "Test Recipe";

        List<String> ingredients = new ArrayList<>();
	    ingredients.add("Chicken");
        ingredients.add("Tomatoes");
        ingredients.add("Basil");
        ingredients.add("Provolone Cheese");
        ingredients.add("Olive Oil");

        List<String> directions = new ArrayList<>();
        directions.add("Grill chicken");
        directions.add("Cover with Cheese");
        directions.add("Eat dat food, mang!");

        Recipe testRecipe = new Recipe(0, testRecipeName, ingredients, directions, LocalDate.now());

        testRecipe.setDescription("Super nom nom Chicken Recipe!");
        testRecipe.setGenre("Italian");
        testRecipe.setRating(Rating.FIVE_STARS);
        testRecipe.setDifficulty(Difficulty.MEDIUM);

        System.out.println(testRecipe);
    }
}
