
package abstractprogramme;

import veicle.Car;
import veicle.MotorCycle;
import veicle.Veicle;


public class AbstractProgramme {

    
    public static void main(String[] args) {
        
        Veicle car=new Car();
        car.start();
        car.stop();
        
        Veicle motorCycle=new MotorCycle();
        motorCycle.start();
        motorCycle.stop();
    }
    
}
