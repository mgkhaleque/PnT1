package methodsCombined;

public class TestComputer {
    public static void main(String[] args) {

        Computer comp1 = new Computer();// creating object

        comp1.brand = "Apple";// variable initialized
        comp1.operatingSystem = "Mac";
        comp1.ram = "8Gb";
        comp1.price = 2100;
        comp1.hardDrive = 512;
        comp1.usMade = true;
        comp1.computerConfiguaration();

        comp1.computerEvaluation();// returning method initialized
        System.out.println("Comp evaluation in 10: " + 9);

        Computer comp = new Computer();// constructor #1 is initialized
        Computer comp2 = new Computer("Mac");// constructor #2 is initialized
        // constructor#3 is initialized
        Computer comp3 = new Computer("Apple", "Mac", "8Gb", 2100, 512, true, 9);

        Computer achilis = new Computer();
        achilis.setDriveSize(256);
        System.out.println("achilis's driveSize: " + achilis.getDriveSize());

        Computer hector = new Computer();
        hector.setDriveSize(556);
        System.out.println("hector's driveSize: " + hector.getDriveSize());

        System.out.println("achilis's driveSize: " + achilis.getDriveSize());

    }

}

