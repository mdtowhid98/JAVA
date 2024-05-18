
package testbinarysearch;


public class TreeNode<E> {
 
//    protected E element;
//    protected TreeNode<E> left;
//    protected TreeNode<E> right;
//
//    public TreeNode(E element) {
//        this.element = element;
//    }
//
//    public TreeNode(E element, TreeNode<E> left, TreeNode<E> right) {
//        this.element = element;
//        this.left = left;
//        this.right = right;
//    }
//
//    @Override
//    public String toString() {
//        return "TreeNode{" + "element=" + element + ", left=" + left + ", right=" + right + '}';
//    }
    
    private E element;
    private E left;
    private E right;

    public TreeNode() {
    }

    public TreeNode(E element, E left, E right) {
        this.element = element;
        this.left = left;
        this.right = right;
    }

    public E getElement() {
        return element;
    }

    public void setElement(E element) {
        this.element = element;
    }

    public E getLeft() {
        return left;
    }

    public void setLeft(E left) {
        this.left = left;
    }

    public E getRight() {
        return right;
    }

    public void setRight(E right) {
        this.right = right;
    }

    @Override
    public String toString() {
        return "TreeNode{" + "element=" + element + ", left=" + left + ", right=" + right + '}';
    }
    
    
    
    
    
    
}
