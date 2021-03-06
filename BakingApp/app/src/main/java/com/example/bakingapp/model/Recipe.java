package com.example.bakingapp.model;

import java.util.List;

import kotlinx.android.parcel.Parcelize;

@Parcelize
public class Recipe {
    public Integer id;
    public String name;
    public List<Ingredient> ingredients;
    public List<Step> steps;
    public Integer servings;
    public String image;
}
