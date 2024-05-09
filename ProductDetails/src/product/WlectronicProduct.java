
package product;


public class WlectronicProduct extends Product{
   
    private int warentyPeriod;

    public WlectronicProduct() {
    }

    public WlectronicProduct(int warentyPeriod) {
        this.warentyPeriod = warentyPeriod;
    }

    public WlectronicProduct(int warentyPeriod, String name, double regulerPrice) {
        super(name, regulerPrice);
        this.warentyPeriod = warentyPeriod;
    }

    @Override
    public double getSalePrice() {
         // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
         if(this.warentyPeriod>1){
         return super.getRegulerPrice()-super.getRegulerPrice()*.15;
         }
         else{
         return super.getRegulerPrice();
         }
    }

   
    
    
}
