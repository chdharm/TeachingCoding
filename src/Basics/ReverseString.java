package Basics;

public class ReverseString {

	public static void main(String[] args) {
	String s="madam";
	String temp="";
	for(int i=s.length()-1;i>=0;i--)
	{
	temp+=s.charAt(i);	
	}
System.out.println(temp);
if(s.equals(temp))
{
	System.out.println("pallindrome");	
}
else
	System.out.println("not pallindrome");		
	}

}
