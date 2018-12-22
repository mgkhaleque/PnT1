package oopEncaptulation;

public class TestStudent {
    public static void main(String[] args) {

        Student st1 = new Student();
        st1.setStName("Achillis");
        st1.setStID(123);
        st1.setStDOB("1-12-18");
        System.out.println(st1.getStName()+ " "+st1.getStID()+ " "+st1.getStDOB());

    }

}
