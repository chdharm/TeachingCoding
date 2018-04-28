package Basics;

import java.util.Scanner;

public class ArmStrongNumberanil
{

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number");
         int n=s.nextInt();
        int temp=n,sum=0;
     	while(n>0)
     	{
     		int r=n%10;
     	 sum=sum+(r*r*r);
     		n=n/10;
     	}
     	if(temp==sum) {
     	System.out.println("ArmStrong Number="+sum);
     	}
     	else
     	{
     		System.out.println("Not ArmStrong Number");
     	}
     	}


	}


