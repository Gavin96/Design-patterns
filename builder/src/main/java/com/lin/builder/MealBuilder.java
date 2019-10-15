package com.lin.builder;

import com.lin.builder.burger.ChickenBurger;
import com.lin.builder.burger.VegBurger;
import com.lin.builder.drink.Coke;
import com.lin.builder.drink.Pepsi;

/**
 * @author longyang.lin
 * @description
 * @create 2018年11月28日18:45
 */
public class MealBuilder {

    public Meal prepareVegMeal() {
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Coke());
        return meal;
    }

    public Meal prepareNonVegMeal() {
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Pepsi());
        return meal;
    }
}
