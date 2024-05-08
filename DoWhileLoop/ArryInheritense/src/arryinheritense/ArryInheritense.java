
package arryinheritense;

import details.Students;

import java.util.ArrayList;
import java.util.Arrays;
public class ArryInheritense {

   
    public static void main(String[] args) {
       
      Students towhid=new Students("towhid", "tfghiuuj", "yuhi", 25, true);
      Students raju=new Students("raju", "hijuo", "484", 29, true);
      
      ArrayList<Students>studentList=new ArrayList<>();
      
      studentList.add(towhid);
      studentList.add(raju);
        
      for(Students s:studentList){
          System.out.println(s);
      }
    }
    
}
