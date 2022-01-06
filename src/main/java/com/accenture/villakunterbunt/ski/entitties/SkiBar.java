package com.accenture.villakunterbunt.ski.entitties;

public class SkiBar extends Place {

    private boolean servesHotFood;
    private boolean servesVeganAlcohol;

    public boolean isServesHotFood() {
        return servesHotFood;
    }

    public void setServesHotFood(boolean servesHotFood) {
        this.servesHotFood = servesHotFood;
    }

    public boolean isServesVeganAlcohol() {
        return servesVeganAlcohol;
    }

    public void setServesVeganAlcohol(boolean servesVeganAlcohol) {
        this.servesVeganAlcohol = servesVeganAlcohol;
    }

    @Override
    public String toString() {
        return "Bar: Hot Food: " + servesHotFood + ", Vegan Alc: " + servesVeganAlcohol + ", name: "
                + getName() + " , Address: " + getAddress();
    }
}
