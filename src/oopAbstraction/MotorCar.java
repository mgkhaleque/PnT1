package oopAbstraction;

/*implements means:
 * using the elements of a Java Interface in your class
 * we can implement as many interfaces as we'd like
 */

public abstract class MotorCar implements Car{

    /* Non-abstract method can be declared
     * Non-abstract method can be implemented
     */

    public void oilMotorEngine() {//non-abstract method
        System.out.println("Runs on oil");
    }

    /* abstract method can be declared
     * But can not be implemented
     */

    public abstract void fourWheelCar();//abstract method

}
