package com.talkingdata.sdmk.design.pattern.builderpattern;

/**
 * User：    ysl
 * Date:   2017/12/21
 * Time:   11:45
 */
public class MealBuilder {


    public Meal prepareVegMeal(){
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Coke());
        return  meal;
    }


    public Meal prepareNonVegMeal(){
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Pepsi());
        return meal;
    }
}
