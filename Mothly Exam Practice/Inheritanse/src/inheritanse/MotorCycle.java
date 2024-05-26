package inheritanse;

public class MotorCycle extends Veihcle {

    @Override
    public void start() {
        System.out.println("MotorCycle engine started");
    }

    @Override
    public void stop() {
        System.out.println("MotorCycle engine stopped");
    }

}
