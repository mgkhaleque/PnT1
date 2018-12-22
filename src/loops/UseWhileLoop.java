package loops;
/*
A while loop is a control flow statement that allows code to be executed repeatedly based on a given Boolean condition.
The while loop can be thought of as a repeating if statement.
While loop starts with the checking of condition. If it evaluated to true, then the loop body statements are executed otherwise first statement following the loop is executed. For this reason it is also called Entry control loop
WL check condition first, if statement is false, it won't work
whileLoop check the condition first, then do the task>Opposite to DoWhileLoop
        Syntax :
        while (boolean condition)
        {
        loop statements...
        }
	*/
public class UseWhileLoop {
    public static void main(String[] args) {
        int value = 10;
		/*while (value<0) { //if value statement is false, we're out of whileLoop/ loop will not do any task (nothing will be printed in console)
			System.out.println(value);
			value --;	//increment/decrement block/if no id block, loop will become a 'infinitLoop' & be working/printing forever without stoping
		}*/
		while (value>0) {//if value statement is true, loop will work (print in console)
            System.out.println(value);
            value--;
        }
    }
}

