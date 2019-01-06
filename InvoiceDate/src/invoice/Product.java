package invoice;

public class Product {
    String name;
    int quantity;
    double rate;
    int unit;

    public Product(String name, int quantity, double rate, int unit) {
        this.name = name;
        this.quantity = quantity;
        this.rate = rate;
        this.unit = unit;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public int getUnit() {
        return unit;
    }

    public void setUnit(int unit) {
        this.unit = unit;
    }
}
