package Basics;
import java.util.*;
public class ReverseStringUsingRecursion {

	public static void main(String [] args){
		Scanner scan=new Scanner(System.in);
		String str=scan.next();
		ReverseStringUsingRecursion obj=new ReverseStringUsingRecursion();
		System.out.println(obj.reverseString(str,0,str.length()-1));
	}
	
	public String reverseString(String str,int be,int en){
		if(be==en){
			return str.substring(be,en+1);
		}
		return str.substring(en,en+1)+reverseString(str,be,en-1);
	}
	
}
