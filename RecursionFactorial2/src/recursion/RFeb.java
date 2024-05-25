
package recursion;


public class RFeb {
     private long index;

    public RFeb() {
    }

    public RFeb(long index) {
        this.index = index;
    }

    public long getIndex() {
        return index;
    }

    public void setIndex(long index) {
        this.index = index;
    }

    @Override
    public String toString() {
        return "RFeb{" + "index=" + index + '}';
    }
     
      public  long feb(long index) {

        if (index == 0) {
            return 0;
        } else if (index == 1) {
            return 1;
        } else {
            return feb(index-1)+feb(index-2);
        }

    }
}
