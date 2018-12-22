package nested;

public class OuterClass {

    public String name;//declare variable
    InnerClassA innerClassA = new InnerClassA();

    //OuterClass Method
    public void outerClassMethodA() {
        System.out.println("This is outer class method A");
        innerClassA.InnerAClassMethodA();
        InnerClassB.InnerBClassMethodA();

    }

    //InnerClass starts
    public class InnerClassA{
        //InnerClassA method
        public void InnerAClassMethodA() {
            System.out.println("This is Inner class-A method A");
        }
    }//end of InnerClass

    //InnerClassB starts
    public static class InnerClassB{
        //InnerClassB method
        public static void InnerBClassMethodA() {
            System.out.println("This is Inner Class-B method A");

        }

    }//end of InnerClassB


}//end of OuterClass
