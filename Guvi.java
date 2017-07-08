package sridharan;

import java.util.Scanner;

public class Guvi {
public static void main(String arr[]){
	 String str;
	 String r="";
     String s="";
     
	 System.out.print("Enter the String:");
	 Scanner st=new Scanner(System.in);
	 str=st.next();
     
      for(int i=0;i<str.length();i++)
      {
          if(!r.contains(str.charAt(i)+""))
              r=r+str.charAt(i);
          else
              s=s+str.charAt(i);
      }
          for(int i=0;i<r.length();i++)
              if(!s.contains(r.charAt(i)+""))
                  System.out.print(r.charAt(i));
}
}
