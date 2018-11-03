package Basics;
abstract class  AbstractClass {
	abstract void m1();
	abstract void m2();
	
}
class A extends AbstractClass{
	public void m1(){
		System.out.println("M1");
	}
	public void m2(){
		System.out.println("m2");
	}
	public static void main(String [] args){
		A obj=new A();
		obj.m1();
		obj.m2();
	}
}
