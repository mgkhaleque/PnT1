package Static;


    // Java program to demonstrate that a static member
// can be accessed before instantiating a class
    class Test
    {
        // static method
        static void m1()
        {
            System.out.println("from m1");
        }

        public static void main(String[] args)
        {
            // calling m1 without creating
            // any object of class Test
            m1();
        }
    }

        /*
        static is a non-access modifier in Java which is applicable for the following:
        blocks
        variables
        methods
        nested classes

        To create a static member(block,variable,method,nested class), precede its declaration with the keyword static.
        When a member is declared static, it can be accessed before any objects of its class are created, and without reference to any object.
        For example, in above java program, we are accessing static method m1() without creating any object of Test class.

        */