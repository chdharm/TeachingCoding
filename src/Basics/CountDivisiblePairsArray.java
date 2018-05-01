package Basics;
import java.util.Scanner;
public class CountDivisiblePairsArray {
public static void main(String[] args) {
	Scanner s= new Scanner(System.in);
	System.out.println("Enter the size of array");
	int i, j,count=0;
	int n= s.nextInt();
	System.out.println("Enter the elements of array");
	int a[]= new int[n];
	for( i=0;i<n;i++) {
		a[i]=s.nextInt();
	}
	for(i=0;i<n;i++) {
		for(j=0;j<n;j++) {
			if(i!=j) {
	           if(a[i]%a[j]==0)
			    count= count+1;}
			
		}
		
	}
	System.out.println(count);
}
}
