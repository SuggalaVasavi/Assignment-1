package com.basic;

public class Swap {
	int a,b;

	public void swap(Swap obj,int a,int b){

		System.out.println("\n"+"Before Swapping of two numbers:"+"\n"+"a="+a+" "+"b="+b );
		int temp;
		int firstnumber = 0;
		int Secondnumber = 0;
		temp=a;
		a=b;
		b=temp;
firstnumber=a;
Secondnumber=b;
System.out.println("After Swapping of two numbers:"+"\n");
System.out.println("a="+firstnumber+""+" b="+Secondnumber);
}

}

