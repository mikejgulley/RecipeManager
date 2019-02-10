package com.lumatik.model;

import java.time.LocalDate;
import java.util.Map;

/**
 * Created by mikejgulley on 5/21/2017.
 */
public class GroceryList {
    private int id;
    private String name;
    private String description;
    private String type;
    private Map<String, Integer> items;
    private LocalDate createDate;
    private LocalDate updateDate;
}
