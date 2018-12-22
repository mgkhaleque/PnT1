package loops;
/*
before checking condition, DWL do the task first for once, but 2nd time it won't work if statement is false

do while loop is similar to while loop with only difference that it checks for condition after executing the statements,
and therefore is an example of Exit Control Loop.

Syntax:
do
{
    statements..
}
while (condition);

 */
public class UseDoWhileLoop {

    public static void main(String[] args) {
        int value = 10;

        do {
            System.out.println(value);

        } while (value<0);//condition is false but DWL will do the task for once first without checking the condition
    }
}

