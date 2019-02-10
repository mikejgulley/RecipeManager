package com.lumatik.controller;

import com.lumatik.dao.RecipeDAO;
import com.lumatik.dao.RecipeDAO_InMemImpl;
import com.lumatik.model.Recipe;
import com.lumatik.ui.ViewIO;
import com.lumatik.ui.ViewIO_ConsoleImpl;

import java.util.List;

/**
 * Created by mikejgulley on 02/09/2019.
 */
public class RecipeController_ConsoleImpl implements RecipeController {
    private RecipeDAO recipeDAO = new RecipeDAO_InMemImpl();
    private ViewIO io = new ViewIO_ConsoleImpl();

    public Recipe addRecipe() {
        String name = io.getRecipeName();
        return recipeDAO.createRecipe(name);
    }

    public Recipe getRecipeById(int id) {
        return null;
    }

    public List<Recipe> getAllRecipes() {
        io.printRecipeList(recipeDAO.getAllRecipes());
        return recipeDAO.getAllRecipes();
    }

    public Recipe updateRecipe() {
        return null;
    }

    public Recipe deleteRecipe() {
        return null;
    }
}
