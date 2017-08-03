package Guvi;

import java.util.Scanner;

public class Stirng_Double {
	
public static void main(String[] args) {
	
	Scanner in=new Scanner(System.in);
	System.out.print("Enter a String:");
	String i=in.next();
	
	
	String out1=i.substring(0,i.length()/2);
	String out2=i.substring(i.length()/2);
	
	if(out1.equalsIgnoreCase(out2)){
		System.out.println("The given Stirng is Double.");
	}
	else{
		System.out.println("The given Stirng is not a Double");
	}
	
}
}
