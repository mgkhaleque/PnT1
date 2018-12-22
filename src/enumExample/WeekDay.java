package enumExample;

//calling enum data in a class
public class WeekDay {
    Week day; //declare enum (Week is enum constant & day is object of enum type)

    //String weekDay; ///declare variable

    public WeekDay() {} //declare default or no argument constructor method

    public WeekDay(Week day) {//declare parameterized constructor method
        this.day = day;
    }
    /*public WeekDay(String weekDay) {//declare String parameterized constructor method
        this.weekDay = weekDay;
    }
    */
    public void whatIShouldDoToday() {//declare void method
        switch(day) {
            case Monday:
                System.out.println("Review Sunday class materials");
                break;
            case Tuesday:
                System.out.println("Start doing the homework");
                break;
            case Wednesday:
                System.out.println("Continue with CodeLab");
                break;
            case Thursday:
                System.out.println("Continue with CodeLab");
                break;
            case Friday:
                System.out.println("Prepare for weekend class materials");
                break;
            case Saturday:
                System.out.println("Join Saturday class");
                break;
            case Sunday:
                System.out.println("oin Sunday class");
                break;
            default:
                System.out.println("No more days left of week. Find another planed to get 8 days a week");
                break;
        }
    }
	/* public void whatIShouldDoOnPlanetMars() {
		switch(weekDay) {
		case "Monday":
			System.out.println("Review Sunday class materials");
			break;
		case "Tuesday":
			System.out.println("Start doing the home work");
			break;
		case "Wednesday":
			System.out.println("Continue with CodeLab");
			break;
		case "Thursday":
			System.out.println("Continue with CodeLab");
			break;
		case "Friday":
			System.out.println("Prepare for Weekend class materails");
			break;
		case "Saturday":
			System.out.println("Join Saturday class");
			break;
		case "Sunday":
			System.out.println("Join Sunday class");
			break;
	   default:
			System.out.println("No More days left of Week. Find another planet to get 8 days a week");
			break;
		}
}
*/

}



