package Exercise1;

public class Cosmetics extends Product{
    public Cosmetics(String name, String description, int quantity, int price) {
        super(name, description, quantity, price);
    }
    private String color;
    private int weight;

    public Cosmetics(String name, String description, int quantity, int price, String color, int weight) {
        super(name, description, quantity, price);
        this.color = color;
        this.weight = weight;
    }
}
