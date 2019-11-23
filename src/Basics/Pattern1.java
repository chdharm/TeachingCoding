package Basics;
import java.util.Scanner;
public class Pattern1 {
	public static void main(String[] args) {
		Scanner kb=new Scanner(System.in);
		System.out.println("enter a number");
		int n=kb.nextInt();
		for(int i=0;i<=n;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
