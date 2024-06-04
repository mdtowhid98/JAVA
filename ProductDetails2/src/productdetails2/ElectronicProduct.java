package productdetails2;

public class ElectronicProduct extends Product {

    private int warrentyPeriod;

    public ElectronicProduct() {
    }

    public ElectronicProduct(int warrentyPeriod) {
        this.warrentyPeriod = warrentyPeriod;
    }

    public ElectronicProduct(int warrentyPeriod, String name, double regulerPrice) {
        super(name, regulerPrice);
        this.warrentyPeriod = warrentyPeriod;
    }

    public int getWarrentyPeriod() {
        return warrentyPeriod;
    }

    public void setWarrentyPeriod(int warrentyPeriod) {
        this.warrentyPeriod = warrentyPeriod;
    }

    @Override
    public double getSalesPrice() {

        if (this.warrentyPeriod > 1) {
            return super.getRegulerPrice()-super.getRegulerPrice()*.15;
        }
        else{
        
        return super.getRegulerPrice();
        }
    }

}
