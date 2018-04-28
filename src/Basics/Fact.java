package Basics;

import java.util.Scanner;

public class Fact {

	public static void main(String[] args) {
Scanner kb=new Scanner(System.in);
System.out.println("enter a number");
int n=kb.nextInt();
int fact=1;
for(int i=1;i<=n;i++)
{
	fact=fact*i;
}
System.out.println(fact);
	}

}
