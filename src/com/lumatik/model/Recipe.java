package com.lumatik.model;

import java.time.LocalDate;
import java.util.List;

/**
 * Created by mikejgulley on 5/21/2017.
 */
public class Recipe {
    private int id;
    private String name;
    private String description;
    private String genre;
    private List<String> ingredients;
    private List<String> altIngredients;
    private List<String> cookware;
    private List<String> directions;
    private Rating rating;
    private Difficulty difficulty;
    private boolean isFavorite;
    private List<String> pairWithOptions;
    private String pictureUrl;
    private String videoUrl;
    private LocalDate createDate;
    private LocalDate lastMadeDate;
    private LocalDate updateDate;
}
