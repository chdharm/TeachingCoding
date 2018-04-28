
package Basics;
import java.util.Scanner;
public class Three {
	void m1(int a)
	{
	System.out.println("int");	
	}
void m2(double b)
	{
		System.out.println("double");		
	}
	void m3(String c)
	{
		System.out.println("string");		
	}
	public static void main(String[] args) {
	Three a1=new Three();
	a1.m1(5);
	a1.m2(10.0);
	a1.m3("ajit");

}
}