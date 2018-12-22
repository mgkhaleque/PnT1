package oopEncaptulation;

public class PnT {
    private String sName;
    private int iID;
    private double dGrade;
    private boolean bdCitizen;
    private char sex;

    public PnT() {//default or non-argument constructor

    }

    public PnT(String sName, int iID, double dGrade, boolean bdCitizen, char sex) {
        super();
        this.sName = sName;
        this.iID = iID;
        this.dGrade = dGrade;
        this.bdCitizen = bdCitizen;
        this.sex = sex;
    }


    public String getsName() {
        return sName;
    }
    public void setsName(String sName) {
        this.sName = sName;
    }
    public int getiID() {
        return iID;
    }
    public void setiID(int iID) {
        this.iID = iID;
    }
    public double getdGrade() {
        return dGrade;
    }
    public void setdGrade(double dGrade) {
        this.dGrade = dGrade;
    }
    public boolean isBdCitizen() {
        return bdCitizen;
    }
    public void setBdCitizen(boolean bdCitizen) {
        this.bdCitizen = bdCitizen;
    }
    public char getSex() {
        return sex;
    }
    public void setSex(char sex) {
        this.sex = sex;
    }

}
