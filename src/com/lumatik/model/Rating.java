package com.lumatik.model;

/**
 * Created by mikejgulley on 5/21/2017.
 */
public enum Rating {
    NONE("Not yet rated."),
    ONE_STAR("*"),
    TWO_STARS("**"),
    THREE_STARS("***"),
    FOUR_STARS("****"),
    FIVE_STARS("*****");

    private final String rating;

    Rating(String rating) {
        this.rating = rating;
    }

    public String getRating() {
        return rating != null ? rating : this.NONE.getRating();
    }
}
