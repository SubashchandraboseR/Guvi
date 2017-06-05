public class Number 
{
	public static void main(String args[]){
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the Number:");
	int n=s.nextInt();
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
