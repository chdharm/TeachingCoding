package Basics;
//import java.util.Scanner;
public class FabnacciRecursionAjit {
	
	public static int  m1(int n)
	{
		if(n==0||n==1)
			return n;
		return	m1(n-1)+m1(n-2);
	}
	
	public static void main(String[] args) {
		int p=m1(6);
		System.out.println(p);
	}
	
}
