package Basics;
public class MyArrayList {
public Object[]	a;
private int p;
MyArrayList()
{
this(10);	
}	
MyArrayList(int intialsize)
{
a=new Object[intialsize];	
}
public void add(Object arg)	
{
if(p>=a.length)	
incresesize();
a[p++]=arg;
}
public Object get(int index) 
{
if(index>=size()) throw new IndexOutOfBoundsException();
return a[index];
}
private int size() {
	
	return p;
}
private void incresesize() {
Object b[]=new Object[a.length*2];
for(int i=0;i<a.length;i++)
{
	b[i]=a[i];
}
a=b;	
}
public String toString()
{
String str="["+a[0]	;
for(int i=1;i<size();i++)
{
	str=str+a[i];
}
	return str+"]";	
}
public static void main(String[] args) {
	MyArrayList a1 =new MyArrayList();
	a1.add(10);
	a1.add(20);
	a1.add(30);
	System.out.println(a1);
	}
}
