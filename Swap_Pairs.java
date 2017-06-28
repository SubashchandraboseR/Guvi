import java.util.Scanner;

public class StrSwap {
	
	 public String main() {
		 String s;
		 Scanner sc=new Scanner(System.in);
		 s=sc.next();
		 String even = "";
		    String odd = "";
		    int length = s.length();

		    for (int i = 0; i <= length-2; i+=2) {          
		        even += s.charAt(i+1) + "" + s.charAt(i);
		    }

		    if (length % 2 != 0) {          
		        odd = even + s.charAt(length-1);
		        return odd;
		    } else {
		        return even;
		    }
		}
	 
		public static void main(String[] args)
		{
		StrSwap  sw= new StrSwap ();
		System.out.print("Enter the String: ");
		
		System.out.print("Swaping String is: "+sw.main());
	}

}
