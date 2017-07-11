
import java.util.Scanner;

public class WeekDay {
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a Day: ");
		String a=s.next();
		
		a=a.toLowerCase();
		
		if(a.equals("mon") || a.equals("tue") || a.equals("wed") || a.equals("thu") 
				|| a.equals("fri")) {
			
			System.out.println("True\nThe day is WeekDay");
		}
		
		if(a.equals("sat") || a.equals("sun")) {
			
			System.out.println("False\nThe day is WeekEnd");
		}
	}
}

