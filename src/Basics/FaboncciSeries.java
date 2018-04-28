


	package Basics;
	import java.util.Scanner;
	public class FaboncciSeries {

	
		public static void main(String []args) {
			Scanner s= new Scanner(System.in);
			int term,n1,n2,sum=0;
			System.out.println("enter the no. of terms");
			term= s.nextInt();
			System.out.println("Enter the nvalue of number");
			n1 = s.nextInt();
			n2= s.nextInt();
			for(int i=0;i<=term;i++ ) {
				sum= n1+n2;
				n1=n2;
				n2=sum;
				System.out.print(" "+sum);
			}
			
			
		}

	}
