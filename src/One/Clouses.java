package One;

public abstract class Clouses {
private int price;
private String color;
private ClouseSize clouseSize;

    public Clouses() {
    }

    public Clouses(int price, String color, ClouseSize clouseSize) {
        this.price = price;
        this.color = color;
        this.clouseSize = clouseSize;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public ClouseSize getClouseSize() {
        return clouseSize;
    }

    public void setClouseSize(ClouseSize clouseSize) {
        this.clouseSize = clouseSize;
    }

    @Override
    public String toString() {
        return "Clouses{" +
                "price=" + price +
                ", color='" + color + '\'' +
                ", clouseSize=" + clouseSize +
                '}';
    }
}
