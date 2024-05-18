
package binarysearctrees;


public class Searcing <E>{
  
    protected E element;
    protected E left;
    protected E right;

    public Searcing(E element) {
        this.element = element;
    }

    public Searcing(E element, E left, E right) {
        this.element = element;
        this.left = left;
        this.right = right;
    }

    @Override
    public String toString() {
        return "Searcing{" + "element=" + element + ", left=" + left + ", right=" + right + '}';
    }

    
    
    
}
