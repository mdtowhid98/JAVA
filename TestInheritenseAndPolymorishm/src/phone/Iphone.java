
package phone;


public class Iphone extends Mobile{
   
    private String appStore;

    public Iphone() {
    }

    public Iphone(String appStore) {
        this.appStore = appStore;
    }

    public Iphone(String appStore, boolean makeCall, String textMassege, String camea, String multiMedia) {
        super(makeCall, textMassege, camea, multiMedia);
        this.appStore = appStore;
    }

    public String getAppStore() {
        return appStore;
    }

    public void setAppStore(String appStore) {
        this.appStore = appStore;
    }

    @Override
    public String toString() {
        return "Iphone{" + "appStore=" + appStore + '}';
    }

    @Override
    public void printDetails() {
        super.printDetails(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        
        System.out.println(" "+appStore);
    }
    

   
    
    
    
    
    
}
