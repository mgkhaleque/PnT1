package enumExample;



public class TestWeek {
    public static void main(String[] args) {//calling enum
        WeekDay day = new WeekDay(Week.Wednesday);//create object
        day.whatIShouldDoToday();//calling void method

	/*	WeekDay day2 = new WeekDay ("Friday");//calling String
		day2.whatIShouldDoToday();
	*/

    }

}
