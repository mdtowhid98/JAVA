
package febo;


public class Febonacci {
    public static int feb(int index) {
      if(index==0){
      return 0;
      } 
      else if(index==1){
      return 1;
      }
      else{
      return feb(index-1)+feb(index-2);
      }
    }
 
}
