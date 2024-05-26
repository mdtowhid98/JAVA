package veicle;

public class Car extends Veicle {

    @Override
    public void start() {

        System.out.println("Car Engine Started");
    }

    @Override
    public void stop() {
        System.out.println("Car Engine Stopped");
    }

}
