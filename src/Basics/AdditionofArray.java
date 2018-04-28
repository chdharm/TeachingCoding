package Basics;

import java .util.Scanner;
public class AdditionofArray{
	public static void main(String []args) {
	Scanner s= new Scanner(System.in);
	System.out.println("Enter the size of first array");
	int n = s.nextInt();
	int a[]= new int[n];
	int i;
	System.out.println("Enter the element of first array");
	for(i=0;i<n;i++) {
		a[i]= s.nextInt();
	}
	System.out.println("Enter the size of second array");
	int m = s.nextInt();
	int b[]= new int[m];
	System.out.println("Enter the elements of second array");
	for(i=0;i<m;i++) {
		b[i]= s.nextInt();
	}
	
	
	if(n==m) {
	int c[]= new int[n];
	for(i=0;i<n;i++) {
		c[i]=a[i]+b[i];
	}
	for(i=0;i<n;i++) {
		System.out.print(" " +c[i]);
	}}
	if(n>m) {
		int g[]= new int[n];
		for(i=0;i<n;i++) {
			if (i<m) {
			g[i]=a[i]+b[i];}
			else {
				g[i]=a[i];
			}
		}
	for(i=0;i<n;i++) {
		System.out.print(" "+g[i]);
	}}
	if (n<m) {
		int l[]= new int[m];
		for(i=0;i<m;i++) {
			if(i<n) {
			l[i]=a[i]+b[i];}
			else
				l[i]=b[i];
				
		}
	for(i=0;i<m;i++) {
		System.out.print(" "+l[i]);
	}}
	
	
	
	
	
}}