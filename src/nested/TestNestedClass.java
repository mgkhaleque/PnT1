package nested;

public class TestNestedClass {
    public static void main(String[] args) {
        OuterClass outerclass = new OuterClass();
        outerclass.outerClassMethodA();
        OuterClass.InnerClassB  outerB = new OuterClass.InnerClassB();
       // OuterClass.InnerClassB.InnerBClassMethodA();

    }
}
