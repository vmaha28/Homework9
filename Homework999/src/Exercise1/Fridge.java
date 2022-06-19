package Exercise1;

public class Fridge extends Electronics{
    public Fridge(String name, String description, int quantity, int price) {
        super(name, description, quantity, price);

    }

    public Fridge(String name, String description, int quantity, int price, String type, int length, int width, double height, double weight) {
        super(name, description, quantity, price, type, length, width, height, weight);
    }
 public int temperature;

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }
}
