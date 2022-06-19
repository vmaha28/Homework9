package Exercise1;

public class Product {
    private int price;
    private String name;
    private String description;
    private int quantity;

    public Product(String name, String description, int quantity,int price) {
        this.name = name;
        this.description = description;
        this.quantity = quantity;
        this.price=price;
    }

    public int getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getQuantity() {
        return quantity;
    }
}
