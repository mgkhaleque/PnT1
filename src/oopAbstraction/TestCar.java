package oopAbstraction;

public class TestCar {
    public static void main(String[] args) {

        //not allow to make an instances from interface class
        Car car = new Toyota();//Car here is a interface not Class
        car.start();
        car.stop();
        car.fourWheelCar();


        Toyota camry = new Toyota();
        camry.motorCar();
        camry.start();
        camry.stop();
        camry.oilMotorEngine();
        camry.electricBattery();
        camry.fourWheelCar();
        camry.motorCar();


        MotorCar hybridCar = new Toyota();
        hybridCar.fourWheelCar();
        hybridCar.oilMotorEngine();
        hybridCar.start();
        hybridCar.stop();

    }

}
