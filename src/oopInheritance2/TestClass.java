package oopInheritance2;

public class TestClass {
public static void main(String[] args) {
        ClassA ca = new ClassA();
        ca.ClassA();
        ca.ClassB();
        ca.ClassC();

        ClassB cb = new ClassB();
        cb.ClassB();
        cb.ClassC();

        ClassC cc = new ClassC();
        cc.ClassC();

        ClassD cd = new ClassD();
        cd.ClassC();
        cd.ClassD();

        ClassE ce = new ClassE();
        ce.ClassE();
        ce.ClassC();

        }
 }
