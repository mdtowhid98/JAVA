package product;

public class Product {

    private String name;
    private double regulerPrice;

    public Product() {
    }

    public Product(String name, double regulerPrice) {
        this.name = name;
        this.regulerPrice = regulerPrice;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRegulerPrice() {
        return regulerPrice;
    }

    public void setRegulerPrice(double regulerPrice) {
        this.regulerPrice = regulerPrice;
    }

    public double getSalePrice() {
        return regulerPrice;
    }
}
