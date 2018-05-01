package Basics;
import java.util.Scanner;
public class CallingMethodFactorial {

	public static void main(String []args) {
         
System.out.println(Factorial());	}
	public static int Factorial() {
		Scanner s= new Scanner(System.in);
		int i, result=1;
		int num= s.nextInt();
		for(i=1;i<=num;i++) {
		    result=result*i;	
		}
		return result;
	}
	
}
