package Basics;
import java.util.Scanner;
public class ArrayOddPlaceOddNoAddition {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n= s.nextInt();
		int a[]= new int[n];
		System.out.println("Enter the elements of array");
		int sum=0;
		for(int i=0;i<n;i++) {
			a[i]=s.nextInt();
			if(i%2!=0) {
			 if(a[i]%2!=0) {
				 sum=sum+a[i];
			 }
			}
		}
		System.out.println("Desired Addition  "  +sum);
	
		
		
		
	}

}
