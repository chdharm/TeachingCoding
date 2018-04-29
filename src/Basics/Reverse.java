package Basics;
import java.util.Scanner;
public class Reverse {
	public static void main(String[] args) {
Scanner kb=new Scanner(System.in);
System.out.println("enter a number");
int n=kb.nextInt();
int r=0,rev=0, p;
p=n;
while(p!=0)
{
	r=p%10;
	rev=rev*10+r;
	p=p/10;
}
System.out.println(rev);
if(rev==n)
{
	System.out.println("pallindrome");
}
	}

}
