package methodsConstructor;

public class Employee {
    String fullName;
    int salary;
    char sex;
    boolean usCitizen;
    int evaluation;
    String origin;


    public Employee() {//default or non-argument constructor/constructor declared

        System.out.println("This is from default constractor");
    }

    public Employee (String fullName) {//parameterized constructor (String fullName is a parameter or local variable)
        this.fullName = fullName;
        System.out.println(fullName);
    }

    public Employee(String fullName, int salary, char sex, boolean usCitizen, int evaluation, String origin) {
        this.fullName = fullName;
        this.salary = salary;    //write in a chronological order as per declared variables
        this.sex = sex;
        this.usCitizen = usCitizen;
        this.evaluation = evaluation;
        this.origin = origin;

        System.out.println(fullName+ "  "+salary+ "  "+sex+" "+usCitizen+ " "+evaluation+ " "+origin);
    }

    public static void main(String [] args) {

        Employee emp1 = new Employee();//Constructor #1 initialized
        Employee emp2 = new Employee("Achillis");//Constructor #2 initialized
        Employee emp3 = new Employee("Hector", 255000, 'M', true, 8, "US");//Constructor #3 initialized

    }

}
