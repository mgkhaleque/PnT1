package methodsVoidReturning;

public class VEmployee {
    String fullName;//declare variables
    int salary;
    char sex;
    boolean usCitizen;

    public void employeeInfo() {//void or non-returning method declared
        //method implemented
        System.out.println("Emp Name: "+fullName+ " Emp salary: "+salary+ " Emp sex: "+sex+ " Emp citizenship info: "+usCitizen);

    }

    public static void main(String []args) {//main method

        VEmployee emp1 = new VEmployee();//Object created

        emp1.fullName = "Achilis";//initialized variables for emp1
        emp1.salary = 1200;
        emp1.sex = 'M';
        emp1.usCitizen = true;

        emp1.employeeInfo();//calling method for emp1

        VEmployee emp2 = new VEmployee();//initialized variables for emp2
        emp2.fullName = "Hector";
        emp2.salary = 3200;
        emp2.sex = 'M';
        emp2.usCitizen = false;

        emp2.employeeInfo();//calling method for emp2

    }

}
