package oopEncaptulation;

public class TestPnT {
    public static void main(String[] args) {

        PnT ns = new PnT();

        ns.setsName("Achillis");
        ns.setiID(113);
        ns.setdGrade(4.999);;
        ns.setBdCitizen(false);
        ns.setSex('M');

        System.out.println("This is Achillis info: Name: "+ns.getsName()+ " ID: "+ns.getiID()+ " Grade: "+ns.getdGrade()+ " CitizenshipInfo: "+ns.isBdCitizen()+
                " Sex: " +ns.getSex());

        PnT hector = new PnT("Hector", 112, 4.5, false, 'M');
        System.out.println("This is Hector's info> Name: "+hector.getsName()+" ID: "+hector.getiID()+" Grade: "+hector.getdGrade()+  "CitizenshipInfo:" + hector.isBdCitizen()+" Sex: "+hector.getSex());

        PnT agamemnon = new PnT("agamemnon", 114, 4.8, false, 'M');
        System.out.println("This is Agamemnon's info> Name: "+agamemnon.getsName()+" ID: "+agamemnon.getiID()+" Grade: "+agamemnon.getdGrade()+  "CitizenshipInfo:" + agamemnon.isBdCitizen()+" Sex: "+agamemnon.getSex());

        PnT afrodite = new PnT("afrodite", 117, 4.7, false, 'F');
        System.out.println("This is Afrodite's info> Name: "+afrodite.getsName()+" ID: "+afrodite.getiID()+" Grade: "+afrodite.getdGrade()+  "CitizenshipInfo:" + afrodite.isBdCitizen()+" Sex: "+afrodite.getSex());

    }

}
