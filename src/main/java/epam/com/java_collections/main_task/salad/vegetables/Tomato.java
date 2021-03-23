package epam.com.java_collections.main_task.salad.vegetables;

import java.awt.*;

public class Tomato extends Vegetable {

    public Tomato(int weight, String name, int colorieContent, int price, Color color) {
        super(weight, name, colorieContent, price, color);
    }

    @Override
    public String toString() {
        return "Tomato," + super.toString();
    }
}
