package Basics;
import java.util.Scanner;
public class SumOfEvenNumber {
	public static void main(String[] args) {
		Scanner kb=new Scanner(System.in);
		System.out.println("enter a number");
		int n=kb.nextInt();
		int sum=0;
		for(int i=1;i<=n;i++)
		{
			if(i%2==0)
	 			sum=sum+i;
		}
		System.out.println(sum);
	}
}
