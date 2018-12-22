package oopPolymorphism;

public class TestCalculator {
    public static void main(String[] args) {

        LandCalculator2 cal = new LandCalculator2();
        System.out.println(cal.areaOfLand(10, 15));
        System.out.println("Land cal: "+ cal.areaOfLand(12, 15, 20));


        ModernCalculator mc = new ModernCalculator();
        System.out.println(mc.areaOfLand(18, 20, 25));

    }

}
