package com.lumatik.model;

import java.time.LocalDate;
import java.util.List;

/**
 * Created by mikejgulley on 5/21/2017.
 */
public class Recipe {
    private final int id;
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
    private List<String> notes;
    private String pictureUrl;
    private String videoUrl;
    private LocalDate createDate;
    private LocalDate lastMadeDate;
    private LocalDate updateDate;

    public Recipe(int id, String name) {
        this.id = id;
        this.name = name;
        this.difficulty = Difficulty.NONE;
        this.rating = Rating.NONE;
        this.createDate = LocalDate.now();
    }

    public Recipe(int id, String name, List<String> ingredients, List<String> directions, LocalDate createDate) {
        this.id = id;
        this.name = name;
        this.ingredients = ingredients;
        this.directions = directions;
        this.createDate = createDate;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<String> ingredients) {
        this.ingredients = ingredients;
    }

    public List<String> getAltIngredients() {
        return altIngredients;
    }

    public void setAltIngredients(List<String> altIngredients) {
        this.altIngredients = altIngredients;
    }

    public List<String> getCookware() {
        return cookware;
    }

    public void setCookware(List<String> cookware) {
        this.cookware = cookware;
    }

    public List<String> getDirections() {
        return directions;
    }

    public void setDirections(List<String> directions) {
        this.directions = directions;
    }

    public Rating getRating() {
        return rating;
    }

    public void setRating(Rating rating) {
        this.rating = rating;
    }

    public Difficulty getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(Difficulty difficulty) {
        this.difficulty = difficulty;
    }

    public boolean isFavorite() {
        return isFavorite;
    }

    public void setFavorite(boolean favorite) {
        isFavorite = favorite;
    }

    public List<String> getPairWithOptions() {
        return pairWithOptions;
    }

    public void setPairWithOptions(List<String> pairWithOptions) {
        this.pairWithOptions = pairWithOptions;
    }

    public String getPictureUrl() {
        return pictureUrl;
    }

    public void setPictureUrl(String pictureUrl) {
        this.pictureUrl = pictureUrl;
    }

    public String getVideoUrl() {
        return videoUrl;
    }

    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
    }

    public LocalDate getCreateDate() {
        return createDate;
    }

    public void setCreateDate(LocalDate createDate) {
        this.createDate = createDate;
    }

    public LocalDate getLastMadeDate() {
        return lastMadeDate;
    }

    public void setLastMadeDate(LocalDate lastMadeDate) {
        this.lastMadeDate = lastMadeDate;
    }

    public LocalDate getUpdateDate() {
        return updateDate;
    }

//    public void setUpdateDate(LocalDate updateDate) {
//        this.updateDate = updateDate;
//    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Recipe recipe = (Recipe) o;

        if (getId() != recipe.getId()) return false;
        return getName().equals(recipe.getName());
    }

    @Override
    public int hashCode() {
        int result = getId();
        result = 31 * result + getName().hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Recipe{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", genre='" + genre + '\'' +
                ", rating=" + rating.getRating() +
                ", difficulty=" + difficulty.getDifficulty() +
                ", createDate=" + createDate +
                '}';
    }
}
