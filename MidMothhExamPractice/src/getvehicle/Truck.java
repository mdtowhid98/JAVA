
package getvehicle;


public class Truck extends Vehicle{
    private int Weight;

    public Truck() {
    }

    public Truck(int Weight) {
        this.Weight = Weight;
    }

    public Truck(int Weight, int speed, double regulerPrice, String color) {
        super(speed, regulerPrice, color);
        this.Weight = Weight;
    }

    public int getWeight() {
        return Weight;
    }

    public void setWeight(int Weight) {
        this.Weight = Weight;
    }

    @Override
    public double getSelsPrice() {
         // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        
        if(this.Weight>2000){
        return super.getRegulerPrice()-(getRegulerPrice()*.10);
        }
        else{
        return super.getSelsPrice();
        }
    }

  
    
    
}
