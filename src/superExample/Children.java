package superExample;

/*with the 'super' keyword, a subclass can invoke superClass properties like variable, constructor & method
 * regardless the superClass is abstract or non-abstract
 *
 */
public class Children extends Parents {

    public Children() {//constructor
        //super();       //Invoked supperClass constructor in subClass constructor
        super("Bush");
    }
    public void shapeNheight() {//void method
        System.out.println(super.familyName);//called superClass variable
        super.height();//Invoked superClass method

        System.out.println("Average shape");
    }

}



