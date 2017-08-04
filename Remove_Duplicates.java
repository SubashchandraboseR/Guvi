package guvi;

import java.util.*;

public class Remove_Duplicates {
	
	public static void main(String[] args)
	{
	    Scanner ip=new Scanner(System.in);	
	    System.out.print("Enter the String:");
	    String str=ip.next();
	    
	    TreeSet<Character> s=new TreeSet<Character>();
	    
	    for(int i=0;i<str.length();i++)
	    {
	    	s.add(str.charAt(i));
	    }
	    
	    Iterator<Character> obj=s.iterator();
	    while(obj.hasNext())
	    {
	    	System.out.print(obj.next());
	    }
	}
}
