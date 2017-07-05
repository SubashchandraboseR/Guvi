
public class Calculator {
static void Powerint(int num1,int num2){
	double result= Math.pow(num1,num2);
	System.out.println("Power of one integer and another:"+result);
}
static void Powerdouble(double num3,int num4){
	double result1=Math.pow(num3, num4);
	System.out.println("Power of integer and double:"+result1);
}
static class Main{
	public static void main(String args[]){
		Calculator.Powerint(42, 24);
		Calculator.Powerdouble(56, 45);
	}
}
}

