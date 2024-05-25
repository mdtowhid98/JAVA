
package recursion;




public class SubFactorial {
  
    private int n;

    public SubFactorial() {
    }

    public SubFactorial(int n) {
        this.n = n;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    @Override
    public String toString() {
        return "SubFactorial{" + "n=" + n + '}';
    }
    
    
      public  int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        else{
        return n*factorial(n-1);
        }
    }
}
