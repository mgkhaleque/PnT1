package methodsCombined;

public class Computer {//opening of curly brace and class body

    //variables declared
    String brand; //non-static variables
    String operatingSystem;
    String ram;
    int price;
    int hardDrive;
    boolean usMade;
    int evaluation;

    static int driveSize;// static variable


    //non-static method

    public void computerConfiguaration() {//void type or non-returning method
        //method implemented
        System.out.println("Comp configuration: " +brand+ " "+operatingSystem+ " "+ram+ " "+price+ "  "+hardDrive+ " "+usMade);
    }

    public int computerEvaluation() {//returning method
        return evaluation;
    }

    //constructor#1
    public Computer() {//default or no-argument constructor//constructor #1 is declared
        System.out.println("This is from default constructor");
    }
    //constructor#2
    public Computer(String brand) {//Parameterized constructor/'String brand' is a parameter or called local variable
        this.brand = brand;
        System.out.println(brand);
    }
    //constructor #3 is declared
    public Computer(String brand, String operatingSystem, String ram, int price, int hardDrive, boolean usMade, int evaluation) {
        this.brand = brand;
        this.operatingSystem = operatingSystem;
        this.ram = ram;
        this.price = price;
        this.hardDrive = hardDrive;
        this.usMade = usMade;
        this.evaluation = evaluation;
        System.out.println(brand+ " "+operatingSystem+ " "+ram+ " "+price+ " "+hardDrive+ " "+usMade+ " "+evaluation);
    }



    public void setDriveSize(int driveSize) {
        this.driveSize = driveSize;

    }
    public int getDriveSize() {
        return driveSize;

    }

}

