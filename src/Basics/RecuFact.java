package Basics;
import java.util.Scanner;
public class RecuFact {
	public static int fact(int n)
	{
		if(n==0)
			return 1;
		return n*fact(n-1);
	}

	public static void main(String[] args) {

		int p=fact(4);
	System.out.println(p);
		
	}

}
