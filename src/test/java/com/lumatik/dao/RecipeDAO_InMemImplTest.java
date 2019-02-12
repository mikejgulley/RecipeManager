package com.lumatik.dao;

import com.lumatik.model.Recipe;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RecipeDAO_InMemImplTest {

    private RecipeDAO recipeDAO;

    @BeforeEach
    void setUp() {
        recipeDAO = new RecipeDAO_InMemImpl();
    }

    @Test
    void createRecipe() {
        Recipe recipe0 = recipeDAO.addRecipe("Test Recipe 0");
        assertNotNull(recipe0);
        assertEquals(0, recipe0.getId());

        Recipe recipe1 = recipeDAO.addRecipe("Test Recipe 1");
        assertNotNull(recipe1);
        assertEquals(1, recipe1.getId());

        Recipe recipe2 = recipeDAO.addRecipe("Test Recipe 2");
        assertNotNull(recipe2);
        assertEquals(2, recipe2.getId());
    }

    @Test
    void addIngredientsToRecipe() {
    }

    @Test
    void addDirectionsToRecipe() {
    }

    @Test
    void getAllRecipes() {
        recipeDAO.addRecipe("Test Recipe 0");
        recipeDAO.addRecipe("Test Recipe 1");
        recipeDAO.addRecipe("Test Recipe 2");

        assertEquals(3, recipeDAO.getAllRecipes().size());
    }

    @Test
    void getAllFavoriteRecipes() {
        Recipe recipe0 = recipeDAO.addRecipe("Test Recipe 0");
        Recipe recipe1 = recipeDAO.addRecipe("Test Recipe 1");
        Recipe recipe2 = recipeDAO.addRecipe("Test Recipe 2");

        recipeDAO.markRecipeAsFavorite(recipe0);
        recipeDAO.markRecipeAsFavorite(recipe2);

        assertEquals(2, recipeDAO.getAllFavoriteRecipes().size());
    }

    @Test
    void getRecipesByDateRange() {
    }

    @Test
    void getRecipesByDifficulty() {
    }

    @Test
    void getRecipesByGenre() {
    }

    @Test
    void getRecipesByRating() {
    }

    @Test
    void getRecipesByIngredient() {
    }

    @Test
    void getRecipesByIngredients() {
    }

    @Test
    void getRecipeById() {
        Recipe recipe0 = recipeDAO.addRecipe("Test Recipe 0");
        Recipe recipe1 = recipeDAO.addRecipe("Test Recipe 1");
        Recipe recipe2 = recipeDAO.addRecipe("Test Recipe 2");

        assertEquals(recipe1.getId(), recipeDAO.getRecipeById(1).getId());
    }

    @Test
    void getRecipeByName() {
        Recipe recipe0 = recipeDAO.addRecipe("Test Recipe 0");
        Recipe recipe1 = recipeDAO.addRecipe("Test Recipe 1");
        Recipe recipe2 = recipeDAO.addRecipe("Test Recipe 2");

        assertEquals(recipe2.getId(), recipeDAO.getRecipeByName("Test Recipe 2").getId());
        assertNull(recipeDAO.getRecipeByName("Test Recipe 123456"));
    }

    @Test
    void updateRecipe() {
        Recipe recipe0 = recipeDAO.addRecipe("Test Recipe 0");
        assertEquals("Test Recipe 0", recipeDAO.getRecipeByName("Test Recipe 0").getName());

        Recipe recipe0update = recipeDAO.getRecipeById(recipe0.getId());
        recipe0update.setName("Updated Test Recipe 0");
        recipeDAO.updateRecipe(recipe0);

        assertEquals("Updated Test Recipe 0", recipeDAO.getRecipeById(0).getName());
    }

    @Test
    void deleteRecipe() {
        Recipe recipe0 = recipeDAO.addRecipe("Test Recipe 0");
        Recipe recipe1 = recipeDAO.addRecipe("Test Recipe 1");
        Recipe recipe2 = recipeDAO.addRecipe("Test Recipe 2");

        recipeDAO.deleteRecipe(recipe1);

        assertEquals(2, recipeDAO.getAllRecipes().size());
        assertNull(recipeDAO.getRecipeById(1));
    }

    @Test
    void markRecipeAsFavorite() {
        Recipe recipe1 = recipeDAO.addRecipe("Test Recipe 1");

        assertFalse(recipe1.isFavorite());
        recipeDAO.markRecipeAsFavorite(recipe1);
        assertTrue(recipe1.isFavorite());
    }
}