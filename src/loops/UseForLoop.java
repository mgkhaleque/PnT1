package loops;

public class UseForLoop {
/*for loop provides a concise way of writing the loop structure.
Unlike a while loop, a for statement consumes the initialization, condition and increment/decrement in one line
thereby providing a shorter, easy to debug structure of looping.

    /* walk up to 10 blocks>  walk<10;
     * walk 10 blocks> walk<=10;
     * walk incremental like> walk=walk++
     * walk faster pace> walk=walk+2 or walk+3
     * we can use System.out.println statement in order to print result but it would be repetitive task, see below examples
     * in order to avoid REPETITIVE task, we use ForLoop

  ForLoop structure:
  for (initialize block;conditional or terminator block;incremental/decremental block){
   }

Syntax:
for (initialization condition; testing condition;
        increment/decrement)
        {
        statement(s)
        }
     */
    public static void main(String[] args) {

		/*
		System.out.println(1);//repetitive task
		System.out.println(2);
		System.out.println(3);
		*/

        //(initialization condition; testing condition;increment/decrement)
        for (int walk=0; walk<10;walk = walk+1) {//starting point;end point;rate or frequency of the task
            System.out.println(walk);
        }

    }

}



