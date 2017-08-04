package guvi;

import java.util.Scanner;

public class Array_Rev {
public static void main(String[] args) {
	
	Scanner s=new Scanner(System.in);
	System.out.print("Enter the Array size:");
	int n=s.nextInt();
	int a[]=new int[n];
	
	for(int i=0;i<n;i++){
	a[i]=s.nextInt();		
	}
	
	System.out.println("Enter the number:");
	int n1=s.nextInt();
	
	for(int i=0;i<n;i++){
		if(a[i]==n1){
			
			System.out.print("The reverse array is:");
			
			for(int x=i;x<n-1;x++){
				System.out.print(a[x+1]);
			}
			
				for(i=0;i!=n1;i++){
					System.out.print(a[i]);
				}
		}
	}
}
}
