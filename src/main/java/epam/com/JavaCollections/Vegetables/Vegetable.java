package epam.com.JavaCollections.Vegetables;

public class Vegetable {
    private int weight;
    private String name;
    private int colorieContent;

    public int getColorieContent() {
        return colorieContent;
    }

    public void setColorieContent(int colorieContent) {
        this.colorieContent = colorieContent;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Vegetable(int weight, String name, int colorieContent) {
        this.weight = weight;
        this.name = name;
        this.colorieContent = colorieContent;
    }

    @Override
    public String toString() {
        return " weight=" + weight +
                ", colorieContent=" + colorieContent;
    }
}
