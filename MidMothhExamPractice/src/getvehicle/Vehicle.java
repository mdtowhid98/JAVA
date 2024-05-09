
package getvehicle;


public class Vehicle {
    
    private int speed;
    private double regulerPrice;
    private String color;

    public Vehicle() {
    }

    public Vehicle(int speed, double regulerPrice, String color) {
        this.speed = speed;
        this.regulerPrice = regulerPrice;
        this.color = color;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public double getRegulerPrice() {
        return regulerPrice;
    }

    public void setRegulerPrice(double regulerPrice) {
        this.regulerPrice = regulerPrice;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getSelsPrice(){
    return regulerPrice;
    }
    
    
}
