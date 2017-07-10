import java.util.ArrayList;
import java.util.Scanner;

public class Practies {
	public static void main(String arr[]) {
		Scanner sc=new Scanner(System.in);
		
		String s=sc.next();
		
		for(int i=0;i<=s.length();i++)
		{
			for(int j=i+2;j<=s.length();j++)
			{
				if(s.substring(i, j).equalsIgnoreCase((new StringBuffer(s.substring(i, j))
						.reverse()).toString()))
				{
					System.out.println(s.subSequence(i, j));
				}
			}
		}
	}
}
	
	
	