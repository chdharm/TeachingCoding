package Basics;
import java.util.Scanner;
public class PrimeBetweenTwoNumber {
	public static void main(String[] args) {
		Scanner kb=new Scanner(System.in);
		System.out.println("enter a number");
		int n=kb.nextInt();
		System.out.println("enter 2 a number");
		int m=kb.nextInt();
		int x,i;
		for( x=n;x<=m;x++)
		{
			for( i=2;i<=x;i++)
			{
				if(x%i==0)
				{
					break;
				}
			}
		
if(x==i)
{
	System.out.println(x);
}
		}
	}

}
