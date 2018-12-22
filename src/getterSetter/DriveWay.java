package getterSetter;

public class DriveWay {
    public static int driveWaySize;


    public void setDriveWaySize(int driveWaySize) {

        this.driveWaySize = driveWaySize;
    }

    public int getDriveWaySize() {
        return driveWaySize;
    }

    public static void buildDriveWay() {

        System.out.println("lets build a driveway so that we can share it");
    }

    public static void main(String []args) {

        DriveWay achillis = new DriveWay();
        achillis.setDriveWaySize(11);
        System.out.println("Achillis's driveway size: "+achillis.getDriveWaySize());

        DriveWay kazi = new DriveWay();
        kazi.setDriveWaySize(14);
        System.out.println("Kazi's driveway size: "+kazi.getDriveWaySize());

        DriveWay.buildDriveWay();
    }

}
