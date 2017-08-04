package guvi;

public class Recursive_Function {
 public static void main(String[] args) {
		 
		 Recursive_Function r = new Recursive_Function();
		 System.out.println("The String is: Audi and BMW \n");
		 System.out.println("The reverse String is: "+r.reverse_Str("Audi and BMW"));
		 
	    }
	 
	 String reverse = ""; 
		
	 public String reverse_Str(String str)
	 {
		 if(str.length() == 0)
		 {
			 return str; 
			 }
		 
		 else 
		 {
			 reverse += str.charAt(str.length()-1);
			 reverse_Str(str.substring(0,str.length()-1)); 
			 return reverse;
		 }
		 
		 } 
}
