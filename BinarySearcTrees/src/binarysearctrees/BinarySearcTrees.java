
package binarysearctrees;

import javax.swing.tree.TreeNode;


public class BinarySearcTrees {

   
    public static void main(String[] args) {
       
      Searcing <Integer>root=new Searcing<>(60);
      root.left=new Searcing<>(55);
      root.right=new Searcing<>(65);
    }
    
  
    public static boolean search(E element){
        
    
      Searcing<E>current=root;
      
      while(current!=null){
      if(element<current.element){
      current=current.left;
      }
      
      else if(element>current.element){
      current=current.right;
      }
      
      else{
      return true;
      return false;
      }
      }
    }
    
}
