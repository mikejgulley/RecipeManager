package com.lumatik.model;

/**
 * Created by mikejgulley on 5/21/2017.
 */
public enum Difficulty {
    EASY("Easy"),
    MEDIUM("Medium"),
    HARD("Hard");

    private final String name;

    Difficulty(String name) {
        this.name = name;
    }

    public String getDifficulty() {
        return name;
    }
}
