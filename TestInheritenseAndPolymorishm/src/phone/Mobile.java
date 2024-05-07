
package phone;


public class Mobile {
   
    private boolean makeCall;
    private String textMassege;
    private String camea;
    private String multiMedia;

    public Mobile() {
    }

    public Mobile(boolean makeCall, String textMassege, String camea, String multiMedia) {
        this.makeCall = makeCall;
        this.textMassege = textMassege;
        this.camea = camea;
        this.multiMedia = multiMedia;
    }

    public boolean isMakeCall() {
        return makeCall;
    }

    public void setMakeCall(boolean makeCall) {
        this.makeCall = makeCall;
    }

    public String getTextMassege() {
        return textMassege;
    }

    public void setTextMassege(String textMassege) {
        this.textMassege = textMassege;
    }

    public String getCamea() {
        return camea;
    }

    public void setCamea(String camea) {
        this.camea = camea;
    }

    public String getMultiMedia() {
        return multiMedia;
    }

    public void setMultiMedia(String multiMedia) {
        this.multiMedia = multiMedia;
    }

    @Override
    public String toString() {
        return "Mobile{" + "makeCall=" + makeCall + ", textMassege=" + textMassege + ", camea=" + camea + ", multiMedia=" + multiMedia + '}';
    }
    
    public void printDetails(){
        System.out.println("The mobile is "+makeCall+" "+textMassege+" "+camea+" "+multiMedia);
    }
    
    
    
}
