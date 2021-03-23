package epam.com.java_collections.main_task.salad.vegetables;

import java.awt.*;

public class SweetPepper extends Vegetable {

    public SweetPepper(int weight, String name, int colorieContent, int price, Color color) {
        super(weight, name, colorieContent, price, color);
    }

    @Override
    public String toString() {
        return "SweetPepper," + super.toString();
    }
}