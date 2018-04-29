package Basics;
import java.util.Scanner;
public class Table {
	public static void main(String[] args) {
	Scanner kb=new Scanner(System.in);
	System.out.println("enter a number");
	int n=kb.nextInt();
	for(int i=1;i<=10;i++)
	{
		int p=n*i;
		System.out.println(p);
	}
	}
}
