// Straxinja Labus on 04/23/2020 
// Yes, I was, it's just the comment, explaining what code does

import java.util.GregorianCalendar;
import java.util.Scanner;

public class WeekdayName
{

	public static String weekdayName(int weekday){
		String result = "";

		if(weekday == 1){
			result = "Sunday";
		}else if(weekday == 2){
			result = "Monday";
		}else if(weekday == 3){
			result = "Tuesday";
		}else if(weekday == 4){
			result = "Wednesday";
		}else if(weekday == 5){
			result = "Thursday";
		}else if(weekday == 6){
			result = "Friday";
		}else if(weekday == 7){
			result = "Saturday";
		}else{
			result = "Error";
		}

		return result;
	}
 
	public static void main(String[] args){

	/*	System.out.println("Weekday 1: " + weekday_name(1) );
		System.out.println("Weekday 2: " + weekday_name(2) );
		System.out.println("Weekday 3: " + weekday_name(3) );
		System.out.println("Weekday 4: " + weekday_name(4) );
		System.out.println("Weekday 5: " + weekday_name(5) );
		System.out.println("Weekday 6: " + weekday_name(6) );
		System.out.println("Weekday 7: " + weekday_name(7) );
		System.out.println("Weekday 0: " + weekday_name(0) );
		
		System.out.println();		
		
		System.out.println("Weekday 43: " + weekday_name(43) );
		System.out.println("Weekday 17: " + weekday_name(17) );
		System.out.println("Weekday -1: " + weekday_name(-1) );
 
		GregorianCalendar calendar = new GregorianCalendar();
		int dayOfWeek = calendar.get(GregorianCalendar.DAY_OF_WEEK);

		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a number in range 1-7 ");
		int day = scan.nextInt();

		System.out.println("Today is a " + weekday_name(dayOfWeek) + "!" );
		System.out.println("I would like today to be a " + weekday_name(day) + "!");*/
}

}
