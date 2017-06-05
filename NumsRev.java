public class NumRev {
	public static void main(String args[]){
	    Scanner ch=new Scanner(System.in);
	    System.out.print("Enter the Number= ");
		String str=ch.next(); 
		StringBuilder st=new StringBuilder(str);
		StringBuilder str1=st.reverse();
	    System.out.print("The reverse Number is= "+str1);
}
}