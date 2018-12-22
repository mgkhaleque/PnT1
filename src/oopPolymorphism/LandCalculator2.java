package oopPolymorphism;

public class LandCalculator2 {
    public int areaOfLand(int a, int b) {
        int total = a + b;
        return total;
    }
    public int areaOfLand(int a, int b, int c) {
        int total = a+b+c;
        return total;
    }
    public final void areaOfLand(char a, int b, int c) {
        int total = a+b+c;

    }
    public int areaOfLand(int a, int b, int c, int d) {
        int total = a+b+c+d;
        return total;
    }
    public int areaOfLand(String landName, int a, int b, int c) {
        int value = Integer.parseInt(landName);
        int total = a+b+value;
        return total;

    }

}
