public class Reversestr {
	public static void main(String args[]){
    Scanner ch=new Scanner(System.in);
    System.out.print("Enter the String= ");
	String str=ch.next(); 
	StringBuilder st=new StringBuilder(str);
	StringBuilder str1=st.reverse();
    System.out.print("The reverse String is= "+str1);
}
}