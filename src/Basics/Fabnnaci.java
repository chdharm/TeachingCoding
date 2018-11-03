package Basics;

import java.util.Scanner;

public class Fabnnaci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb=new Scanner(System.in);
		System.out.println("enter a number");
		int n=kb.nextInt();
		int a=0,b=1,c;
		for(int i=0;i<=n;i++)
		{
			c=a+b;
			System.out.println(c);
			a=b;
			b=c;
		}
	
			}		
	}


