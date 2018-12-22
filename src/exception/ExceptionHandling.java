package exception;

public class ExceptionHandling {

    /* Java compiler can't catch arithmetical error during compile time except for runtime
     * Java compiler can catch Syntax error in compile time
     * in order to handle the 'run-time'exception/error, Java offers 'Try-Catch Block'
     * which is called "ExceptionHandling"
     *
     */
        public static void main(String[] args) {
            int num1 = 10;

            //try block starts here
            try {
                int result = num1 / 0;
                System.out.println(result);
            } catch (Exception ex) {// 'ex' is a Exception-variable and could be described in any other word
                //ex.printStackTrace();instead we use System.out.println
                System.out.println("You are not allowed to divide a number by zero");
            }
            //try block ends here
            System.out.println("where is my result");
        }
    }


