import java.util.*;

public class Reverse {
public static void main(String[] args) {
	
	System.out.println("Enter the String:");
	Scanner sc=new Scanner(System.in);
	String s=sc.nextLine();
	
	String ans="";
	String rev[]=s.split(" ");
	
	for(int i=rev.length-1;i>=0;i--) {
		ans+=rev[i]+" ";
	}
	
	System.out.println(ans);
}
}
