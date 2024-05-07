
package testinheritenseandpolymorishm;

import phone.Andorid;
import phone.Iphone;


public class TestInheritenseAndPolymorishm {

    
    public static void main(String[] args) {
        
//        Andorid andorid=new Andorid("Yes use playStore", "Yes", true, "SMS/MMS", "24px", "Use Multimedia");
//        
//        andorid.printDetails();
        
    Iphone iphone=new Iphone();
    
    iphone.setMakeCall(true);
    iphone.setTextMassege("SmS/MMs");
    iphone.setCamea("28px");
    iphone.setMultiMedia("use multimedia");
    iphone.setAppStore("yes");
    
    iphone.printDetails();

    }
    
}
