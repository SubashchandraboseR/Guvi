public class Days {
	public static void main(String ar[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the day=");
		String day=sc.next();
		check(day);
		}
	public static void check(String day)
	{
		if(day.equalsIgnoreCase("Sunday"))
			System.out.print("False");
		else if(day.equalsIgnoreCase("Saturday"))
			System.out.print("False");
		else
			System.out.print("True");
	}
}
