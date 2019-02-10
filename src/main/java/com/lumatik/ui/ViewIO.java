package com.lumatik.ui;

import com.lumatik.model.Recipe;

import java.util.List;

/**
 * Created by mikejgulley on 02/09/2019.
 */
public interface ViewIO {
    void printWelcomeMessage();
    void printMainMenu();
    void printPrompter();
    String getRecipeName();
    void printRecipeList(List<Recipe> recipeList);
}
