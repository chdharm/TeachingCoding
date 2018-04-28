package Basics;

import java.util.Scanner;

public class FibbonacciSeries {

	public static void main(String[] args) {
Scanner s=new Scanner(System.in);
int n1=0,n2=1,n3;
System.out.println("Enter the number:");
int n=s.nextInt();
System.out.println(n1+" \n"+n2);
for(int i=2;i<n;i++)
{
	n3=n1+n2;
	System.out.println(n3);
	n1=n2;
	n2=n3;
}


	}

}
