
package transport;

public class Truck extends Veichle{
  
    private int weight;

    public Truck() {
    }

    public Truck(int weight) {
        this.weight = weight;
    }

    public Truck(int weight, int speed, double regulerPrice, String color) {
        super(speed, regulerPrice, color);
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public double getSalesPrice() {

        if(this.weight>2000){
        return super.getRegulerPrice()-super.getRegulerPrice()*.10;
        }
        
        else{
        return getRegulerPrice();
        }

    }
    
    
    
    
}
