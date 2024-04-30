
package googlerandomnumber;

import java.util.Random;

/**
 *
 * @author Admin
 */
public class GoogleRandomNumber {

   
    public static void main(String[] args) {
       
        
    String randomPassword=" ";
    for(int i=0;i<9;i++){
    if(i==4){
    randomPassword+="-";
    continue;
    }
    randomPassword +=getRandodomCharorNumber();
    }
        System.out.println(randomPassword);   
    }
    
    
    public static char getRandodomCharorNumber() {
       
        Random random=new Random();
        
        int choice=(int)random.nextInt(1,4);
        char result=' ';
        switch (choice) {
            case 1:
                int asciiValueUppercase=random.nextInt(65,91);
                result=(char)asciiValueUppercase;
                break;
                
                case 2:
                int asciiValueNumber=random.nextInt(48,58);
                result=(char)asciiValueNumber;
                break;
          
                case 3:
                int asciiValueLowercase=random.nextInt(97,123);
                result=(char)asciiValueLowercase;
                break;
        }
        return result;
        
    }
}
