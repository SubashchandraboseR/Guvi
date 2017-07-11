
import java.util.Scanner;

public class WeekDay {
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a Day in Full Form: ");
		String a=s.next();
		
		a=a.toLowerCase();
		
		if(a.equals("monday") || a.equals("tuesday") || a.equals("wednesday") || a.equals("thursday") 
				|| a.equals("friday")) {
			
			System.out.println("True\nThe day is WeekDay");
		}
		
		if(a.equals("saturday") || a.equals("sunday")) {
			
			System.out.println("False\nThe day is WeekEnd");
		}
	}
}

