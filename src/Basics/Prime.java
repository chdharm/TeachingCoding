package Basics;
import java.util.Scanner;
public class Prime {
	public static void main(String[] args) {
		Scanner kb=new Scanner(System.in);
		System.out.println("enter a number");
		int n=kb.nextInt();
		int count=0;
	for(int i=1;i<=n;i++)
	{
		if(n%i==0)
			count++;
	}
if(count==2)
	System.out.println("prime");
else
	System.out.println("not prime");
	}

	}


