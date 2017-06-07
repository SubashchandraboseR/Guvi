public class Vowels_Removing {
public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter the String:");
	String str=sc.nextLine();
	String str1=str.replaceAll("[aeiouAEIOU]","");
	StringBuilder str2=new StringBuilder(str1);
	StringBuilder str3=str2.reverse();
	StringBuilder str4=new StringBuilder(str);
	StringBuilder str5=str4.reverse();
	System.out.println("The Reverse String is="+str5);
	System.out.print("The Vowels Removed String is="+str3);
}
}
