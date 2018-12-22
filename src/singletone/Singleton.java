package singletone;

public class Singleton {

    private static Singleton singleton = new Singleton();
    private Singleton(){}

    public static Singleton getInstance(){
        return singleton;

    }
    public void display(){

        System.out.println("I am on singletone class");
    }
}
