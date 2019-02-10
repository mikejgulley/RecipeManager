package com.lumatik.ui;

import com.lumatik.model.Recipe;

import java.util.List;

/**
 * Created by mikejgulley on 02/09/2019.
 */
public interface UiDisplayProvider {
    void displayWelcomeMessage();
    void displayMainMenu();
    int getMainMenuChoice();
    void displayAllRecipes(List<Recipe> recipeList);
}
