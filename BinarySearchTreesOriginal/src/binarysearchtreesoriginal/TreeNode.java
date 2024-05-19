
package binarysearchtreesoriginal;


public class TreeNode<E> {
 protected E elemnt;
 protected TreeNode<E> left;
 protected TreeNode<E> right;

    public TreeNode(E elemnt) {
        this.elemnt = elemnt;
    }

    public TreeNode(E elemnt, TreeNode<E> left, TreeNode<E> right) {
        this.elemnt = elemnt;
        this.left = left;
        this.right = right;
    }

    @Override
    public String toString() {
        return "TreeNode{" + "elemnt=" + elemnt + ", left=" + left + ", right=" + right + '}';
    }
 
 
 
}
