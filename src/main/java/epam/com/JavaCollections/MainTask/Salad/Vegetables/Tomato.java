package epam.com.JavaCollections.MainTask.Salad.Vegetables;

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
