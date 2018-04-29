package Basics;
import java.util.Scanner;
public class HoloDiamond {
	public static void main(String[] args) {
			Scanner kb=new Scanner(System.in);
			System.out.println("enter a number");
			int n=kb.nextInt();
			for(int i=0;i<=n;i++)
			{
				for(int j=0;j<=n;j++)
				{
					if(i+j==n/2||i-j==n/2||j-i==n/2||i+j==n+n/2)
					System.out.print("*");
					else
						System.out.print(" ");	
				}
				System.out.println();
			}
	}
}
