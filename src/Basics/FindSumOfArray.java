package Basics;

import java.util.Scanner;

public class FindSumOfArray {

	public static void main(String[] args) {
	//int arr[]= {1,5,7,-1,5};
		Scanner s=new Scanner(System.in);
          int n=s.nextInt();
          int arr[]=new int[n];
	int sum=6;
	getPairCount(arr,sum);
}
	public static void getPairCount(int arr[],int sum)
	{
		int count=0;
		for(int i=0;i<arr.length;i++)
			for(int j=i+1;j<arr.length;j++)
				if(arr[i]+arr[j]==sum)
					count++;
		System.out.println(count);
	}
}



