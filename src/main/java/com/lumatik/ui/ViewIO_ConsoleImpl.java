package com.lumatik.ui;

import com.lumatik.model.Recipe;
import org.apache.log4j.Logger;

import java.util.List;
import java.util.Scanner;

/**
 * Created by mikejgulley on 02/09/2019.
 */
public class ViewIO_ConsoleImpl implements ViewIO {
    private static Logger logger = Logger.getLogger(ViewIO_ConsoleImpl.class);
    private Scanner sc = new Scanner(System.in);
    private static int counter = 0;

    public void printWelcomeMessage() {
        System.out.println("Welcome to the Lumatik Recipe Manager");
        System.out.println("-------------------------------------");
    }

    public void printMainMenu() {
        System.out.println("Main Menu:");
        System.out.println("What would you like to do?");
        System.out.println("1. Add a new Recipe");
        System.out.println("2. Update an existing Recipe");
        System.out.println("3. View an existing Recipe");
        System.out.println("4. View all Recipes");
        System.out.println("5. Delete an existing Recipe");
        System.out.println("6. Quit");
    }

    public void printPrompter() {
        System.out.print(">>: ");
    }

    public String getRecipeName() {
        System.out.print("Enter the name of the new Recipe: ");
        return sc.next();
    }

    public void printRecipeList(List<Recipe> recipeList) {
        for (Recipe currentRecipe : recipeList) {
            System.out.println(currentRecipe.getId() + ": " + currentRecipe.getName());
            counter++;
        }
    }
}
