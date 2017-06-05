public class Number 
{
	public static void main(String args[]){
	Scanner s=new Scanner(System.in);
	int n = 0;
	System.out.println("Enter the Number:");
	if(n<=0)
	{
		if(n==0)
			System.out.print("The Entered number is zero");
		else
			System.out.print("The Entered number is negative" );
	}
	else 
		System.out.print("The Entered number is positive");
	}
}