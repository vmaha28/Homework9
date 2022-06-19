package Exercise1;

public class Electronics extends Product{
    //Electronics: (extends Product) type(String), length, width, height, weight
    private String type;
    private int length;
    private int width;
    private double height;
    private double weight;


    public Electronics(String name, String description, int quantity, int price) {
        super(name, description, quantity, price);
    }

    public Electronics(String name, String description, int quantity, int price, String type, int length, int width, double height, double weight) {
        super(name, description, quantity, price);
        this.type = type;
        this.length = length;
        this.width = width;
        this.height = height;
        this.weight = weight;
    }

    public String getType() {
        return type;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }
}
