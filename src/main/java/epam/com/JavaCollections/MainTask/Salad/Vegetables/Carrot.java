package epam.com.JavaCollections.MainTask.Salad.Vegetables;

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