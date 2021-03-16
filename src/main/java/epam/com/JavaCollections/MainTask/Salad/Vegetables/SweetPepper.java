package epam.com.JavaCollections.MainTask.Salad.Vegetables;

import java.awt.*;

public class SweetPepper extends Vegetable {
    private int price;
    private Color color;

    public SweetPepper(int weight, String name, int colorieContent, int price, Color color) {
        super(weight, name, colorieContent);
        this.price = price;
        this.color = color;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "SweetPepper," + super.toString();
    }
}