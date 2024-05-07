
package phone;


public class Andorid extends Mobile{
  
    private String playStore;
    private String touchAble;

    public Andorid() {
    }

    public Andorid(String playStore, String touchAble) {
        this.playStore = playStore;
        this.touchAble = touchAble;
    }

    public Andorid(String playStore, String touchAble, boolean makeCall, String textMassege, String camea, String multiMedia) {
        super(makeCall, textMassege, camea, multiMedia);
        this.playStore = playStore;
        this.touchAble = touchAble;
    }

    public String getPlayStore() {
        return playStore;
    }

    public void setPlayStore(String playStore) {
        this.playStore = playStore;
    }

    public String getTouchAble() {
        return touchAble;
    }

    public void setTouchAble(String touchAble) {
        this.touchAble = touchAble;
    }

    @Override
    public String toString() {
        return "Andorid{" + "playStore=" + playStore + ", touchAble=" + touchAble + '}';
    }

    @Override
    public void printDetails() {
        super.printDetails(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        System.out.println("asd"+playStore+" "+touchAble);
    }


    
    
    
}
