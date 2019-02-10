package com.lumatik.ui;

import com.lumatik.model.Recipe;

import java.util.List;
import java.util.Scanner;

/**
 * Created by mikejgulley on 02/09/2019.
 */
public class UiDisplayProvider_ConsoleImpl implements UiDisplayProvider {
//    private Logger logger =
    private ViewIO io = new ViewIO_ConsoleImpl();
    private Scanner sc = new Scanner(System.in);

    public void displayWelcomeMessage() {
        io.printWelcomeMessage();
    }

    public void displayMainMenu() {
        io.printMainMenu();
    }

    // TODO - Add validation - Hibernate? Spring? Validator class?
    public int getMainMenuChoice() {
        io.printPrompter();
        String menuChoice = sc.next();
        return Integer.parseInt(menuChoice);
    }

    public void displayAllRecipes(List<Recipe> recipeList) {
        io.printRecipeList(recipeList);
    }
}
