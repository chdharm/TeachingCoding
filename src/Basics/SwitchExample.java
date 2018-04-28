package Basics;

import java.util.Scanner;

public class SwitchExample {

	public static void main(String[] args) {
		System.out.println("Calculating Ops");
		System.out.println("choose option");
		System.out.println("1. Addition");
		System.out.println("2. Substarction");
		System.out.println("3. Multiplication");
		System.out.println("4. Division");
		System.out.println("5. Exit");
		
		Scanner s=new Scanner(System.in);
		int n=1;
		while(n>0)
		{
		System.out.println("plz select your option");
	    n=s.nextInt();
	    int a=0,b=0;
	    if(n!=5) {
	    	System.out.println("Enter two number:");
	    	a=s.nextInt();
	    	b=s.nextInt();
	    }
		//int breakup=0;
		switch(n)
		{
		case 1:
			System.out.println("sum="+(a+b));
			break;
		case 2:
			System.out.println("Subs="+(a-b));
			break;
		case 3:
			System.out.println("Multiple="+(a*b));
			break;
		case 5:
			System.exit(0);
			//return;
			//break;
		case 4:
			System.out.println("Division="+(a/b));
			break;
		default:
				System.out.println("wrong Input");
				break;
		
		}
//		if(breakup==1) {
//			System.out.println("inside brakup");
//			return;
//		}
		}
}
}
