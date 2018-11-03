package Basics;
import java.util.Scanner ;
import java.util.Arrays ;

class DuplocatesByHDRam {
	
	public static void main(String args[]){
	Scanner scan=new Scanner (System.in);
	System.out.println("Enter the size fo Array : ");
    int n=scan.nextInt();
    System.out.println("Enter the String in the arrya : ");
    String a[]=new String[n];
    for(int i=1;i<n;i++){
    	a[i]=scan.next();
	}
    Arrays.sort(a);
    String x=a[0];
    String z=a[0];
    int count=1 ;
    int y=1 ;
    for(int i=1 ;i<n ;i++) {
    	if(a[i].equals(x)){
    		count ++ ;
		}
    	else {
      	  x=a[i];
	      count=1;     
        }
    	if(count>y){
    		y=count ;
    		z=x;
		}
    }
    System.out.println(z);
  }
}