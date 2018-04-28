package Basics;
import java.util.Scanner;
public class CountNumberOfWords {
	public static void main(String[] args) {
		Scanner kb=new Scanner(System.in);
		System.out.println("enter a string");
		String s=kb.nextLine();
		int count=0;
		for(int i=0;i<s.length()-1;i++)
		{
			if(s.charAt(i)==' '&&s.charAt(i+1)!=' ')
			{
				count++;
			}
		}
System.out.println("number of words="+(count+1));
	}

}
