package Basics;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		
		Scanner kb=new Scanner(System.in);
		System.out.println("enter a number");
		int n=kb.nextInt();
		int r=0,sum=0, p;
		p=n;
		while(p!=0)
		{
			r=p%10;
			sum=sum+r*r*r;
			p=p/10;
		}
		System.out.println(sum);
		if(sum==n)
		{
			System.out.println("armstrong");
		}
			}
	}


