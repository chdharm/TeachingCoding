package Basics;

import java.util.Scanner;
public class ArraySortingAscDesc 
{
    public static void main(String[] args) 
    {
    	 Scanner s= new Scanner(System.in);
 	    System.out.println("Enter the size of array");
 	    int n= s.nextInt();
 	    int temp,i,j;
 	    System.out.println("Enter the elements of the array");
 	    int a[]= new int[n];
 	   for(i=0;i<n;i++){
 	       a[i]= s.nextInt();
 	   }
 		System.out.println("Sorted array");
 		for(i=0;i<n;i++)
 		{
 		    for(j=i+1;j<n;j++)
 		    {
 		        if (a[i]>a[j])
 		        {
 		        temp = a[i];
 		        a[i] = a[j];
 		        a[j] = temp;
 		        }
 		    
 		    }
 	}
 	for(i=0;i<n-1;i++){
 	    System.out.print(a[i]+", ");
 	}
 	System.out.print(a[n-1]);
 	}
 	
    }