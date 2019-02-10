package com.lumatik.model;

/**
 * Created by mikejgulley on 5/21/2017.
 */
public enum Difficulty {
    NONE("Difficulty not set."),
    EASY("Easy"),
    MEDIUM("Medium"),
    HARD("Hard");

    private final String difficulty;

    Difficulty(String difficulty) {
        this.difficulty = difficulty;
    }

    public String getDifficulty() {
        return difficulty != null ? difficulty : NONE.getDifficulty();
    }
}
