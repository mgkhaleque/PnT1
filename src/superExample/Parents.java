package superExample;

    public abstract class Parents {//can make it abstract class later

        String familyName = "Bush";//variable

        public Parents() {//default constructor
            System.out.println("This is parents class constructor");
        }
        public Parents(String familyName) {//Parameterized constructor
            this.familyName = familyName;
            System.out.println("This is parents class constructor "+familyName);
        }
        public void height() {//void method
            System.out.println("Average height");
        }

    }
//a subclass (Children) can invoke superClass's(Parents)constructor and run that
//as abstract class can not create object


