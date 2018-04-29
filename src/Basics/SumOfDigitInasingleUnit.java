package Basics;
import java.util.Scanner;
public class SumOfDigitInasingleUnit {
	public static void main(String[] args) {
		Scanner kb=new Scanner(System.in);
		System.out.println("enter a number");
		int n=kb.nextInt();
		int r=0,sum=0, p;
		p=n;
		while(p!=0)
		{
		while(p!=0)
		{
			r=p%10;
			sum+=r;
			p=p/10;
		}
		
		if(sum>=9)
		{
			p=sum;
			sum=0;
		}
		}
		/* while(n > 0 || sum > 9)
		    {
		        if(n == 0)
		        {
		            n = sum;
		            sum = 0;
		        }
		        sum += n % 10;
		        n /= 10;
		    }*/
System.out.println(sum);
	}

}
