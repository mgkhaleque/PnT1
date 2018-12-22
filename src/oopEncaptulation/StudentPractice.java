package oopEncaptulation;

public class StudentPractice{//opening curly brac/class body

    //declare variable
    private String stName;
    private int stID;
    private String stDOB;


    //getter-setter methods

    public void setStName(String stName) {
        this.stName = stName;
    }
    public String getStName() {
        return stName;
    }


    public void setStID(int stID) {
        this.stID = stID;
    }
    public int getStID() {
        return stID;
    }

    public void setStDOB(String stDOB) {
        this.stDOB = stDOB;
    }
    public String getStDOB() {
        return stDOB;
    }


    public static void main(String []args) {

        StudentPractice stp1  = new StudentPractice();

        stp1.setStName("Maximus");
        stp1.setStID(1234);
        stp1.setStDOB("12-01-1920");

        System.out.println(stp1.getStName()+ " "+ stp1.getStID()+ " "+stp1.getStDOB());

    }

}