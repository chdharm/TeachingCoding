package Basics;

import java.util.Scanner;

public class Pattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb=new Scanner(System.in);
		System.out.println("enter a number");
		int n=kb.nextInt();
		for(int i=0;i<=n;i++)
		{
			for(int j=n;j>=i;j--)
			{
				System.out.print("*");
			}
			System.out.println();
		}

	
	}

}
