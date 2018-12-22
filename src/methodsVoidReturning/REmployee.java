package methodsVoidReturning;

public class REmployee {

    int evaluation;
    String origin;


    public int employeeEvaluation() {
        return evaluation;
    }

    public String employeeOrigin() {
        return origin;
    }

    public static void main(String []args) {

        REmployee emp = new REmployee();

        emp.employeeEvaluation();
        emp.employeeOrigin();
        System.out.println("Emp1 evaluation in 10:" +8+ " Emp origin:"+"US");

        REmployee emp2 = new REmployee();
        emp2.employeeEvaluation();
        emp2.employeeOrigin();
        System.out.println("Emp2 evaluation in: 10:"+7+ " Emp origin: "+"Bangladesh");
    }

}
