package com.lumatik.controller;

import com.lumatik.ui.UiDisplayProvider;
import com.lumatik.ui.UiDisplayProvider_ConsoleImpl;

/**
 * Created by mikejgulley on 02/09/2019.
 */
public class MainController {
    private UiDisplayProvider uiDisplayProvider = new UiDisplayProvider_ConsoleImpl();
    private static boolean isAppRunning;
    private RecipeController recipeController = new RecipeController_ConsoleImpl();

    public MainController() {
        isAppRunning = true;
    }

    public void runRecipeManager() {
        uiDisplayProvider.displayWelcomeMessage();

        boolean isValidMainMenuChoice = true;
        while (isValidMainMenuChoice) {
            while (isAppRunning) {
                uiDisplayProvider.displayMainMenu();
                int mainMenuChoice = uiDisplayProvider.getMainMenuChoice();

                switch (mainMenuChoice) {
                    case 1:
                        recipeController.addRecipe();
                        break;
                    case 2:
                        break;
                    case 3:
                        break;
                    case 4:
                        recipeController.getAllRecipes();
                        break;
                    case 5:
                        break;
                    case 6:
                        return;
                    default:
                        // Display non-valid menu choice message
                        isValidMainMenuChoice = false;
                }
            }
        }
    }
}
