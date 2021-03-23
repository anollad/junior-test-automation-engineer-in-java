package epam.com.java_collections.main_task.salad.vegetables;

import java.awt.*;

public class Carrot extends Vegetable {

    public Carrot(int weight, String name, int colorieContent, int price, Color color) {
        super(weight, name, colorieContent, price, color);
    }

    @Override
    public String toString() {
        return "Carrot," + super.toString();
    }
}