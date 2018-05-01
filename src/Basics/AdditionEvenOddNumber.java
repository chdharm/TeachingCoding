package Basics;
import java.util.Scanner;
public class AdditionEvenOddNumber {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("enter the range");
		int n= s.nextInt();
		int m=s.nextInt();
		int sum=0;
		
		for(int i=n;i<m;i++) {
			if(i%2==0) {
				 sum=sum+i;
			}
		}
		System.out.println("Sum of the even numbers");
		System.out.println(sum);
	}

}
