/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package showcurrenttime;



/**
 *
 * @author Administrator
 */
public class ShowCurrentTime {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        long totalMiliSeconds=System.currentTimeMillis();
        
        long totalSeconds=totalMiliSeconds/1000;
        
        long currentSeconds=totalSeconds%60;
        
        long totalMiniutes=totalSeconds/60;
        
        long currentminiutes=totalMiniutes%60;
        
        long totalHours=(totalMiniutes/60)+6;
        
        long currentHours=totalHours%60;
        
        System.out.println("current time is"+currentHours+":"+currentminiutes+":"+currentSeconds+"GMT");
        
        
        
        
    }
    
}
