package Basics;
import java.util.Scanner;
public class OneToNAdd {
	public static void main(String[] args) {
	Scanner kb=new Scanner(System.in);
System.out.println("enter a number");
int n=kb.nextInt();
int sum=0;
for(int i=0;i<=n;i++)
{
	sum=sum+i;
System.out.println(sum);
}
	}

}
