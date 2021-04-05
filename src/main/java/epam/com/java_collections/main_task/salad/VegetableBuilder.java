package epam.com.java_collections.main_task.salad;

import epam.com.java_collections.main_task.salad.vegetables.Vegetable;

import java.awt.*;

public class VegetableBuilder<T extends Vegetable> {

    private T vegetable;

    public VegetableBuilder(T vegetable) {
        this.vegetable = vegetable;
    }

    public VegetableBuilder setName(String name) {
        vegetable.setName(name);
        return this;
    }

    public VegetableBuilder setWeight(int weight) {
       vegetable.setWeight(weight);
        return this;
    }

    public VegetableBuilder setColorieContent(int colorieContent) {
        vegetable.setColorieContent(colorieContent);
        return this;
    }

    public VegetableBuilder setPrice(int price) {
        vegetable.setPrice(price);
        return this;
    }

    public VegetableBuilder setColor(Color color) {
        vegetable.setColor(color);
        return this;
    }

    public Vegetable build() {
        return vegetable;
    }
}

