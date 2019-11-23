package Basics;
public class OccuranceOfCharacter {
	public static void main(String[] args) {
	String s="bananaaaaa";
	while(s.length()>0)
	{
		char c=s.charAt(0);
		int n=s.length()-s.replace(c+"", "").length();
		System.out.println(c+"="+n);
		s=s.replace(c+"", "");
	}

	}

}
