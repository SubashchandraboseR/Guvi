import java.util.Scanner;

public class CamelCase {
	public static void main(String[] args) {
		
	    Scanner input=new Scanner(System.in);
	    int count=0;
	    int flag=0;
	    System.out.print("Enter a string:");
	    String str=input.next();
	
	    for(int i=0;i<str.length();i++)
	    {
	    	if(str.charAt(i)>=65&&str.charAt(i)<=90) //Check the UpperCase Letters.
	    	{
	    		count++;
	    	}
	    	if(str.charAt(i)>=97&&str.charAt(i)<=122) //Check the LowerCase Letters.
	    	{
	    		flag=1;
	    	}
	    }
	    
	    if(flag==1&&count>1)
	    {
	    	System.out.println("The Given String is CamelCase");
	    }
	    else
	    {
	    	System.out.println("The Given String is Not a CamelCase");
	    }
	}
}
