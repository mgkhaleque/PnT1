package oopAbstraction;

public class Toyota extends MotorCar implements Car{
    /*
     * Toyota is a Concrete or Full-fledged Class
     * 'extends' means creating a subclass of the class we're going to extending.
     * Class can extends abstract Class but not Interface
     * Only one extension (abstract class ) in new class is allowed
     * but multiple implementation (Interface)possible
     * Class can implement interface but not abstract
     */
    //Car
    public void start() {//method implemented
        System.out.println("start the car to drive");
    }
    public void stop() {
        System.out.println(" put on break to stop the car");
    }

    // Toyota
    public void motorCar() {
        System.out.println("implement motor engine");
    }

    //HybridCar
    public void electricBattery() {
        System.out.println("implement electric battery engice");
    }

    //MotorCar
    public void fourWheelCar() {
        System.out.println("implement four wheel drive");
    }



}
