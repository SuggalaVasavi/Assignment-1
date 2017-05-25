package com.basic;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Methods {
	static void printPrimes(int number) {
		int i,num=1,count=0;
		try{
			System.out.println("List of  prime numbers up to "+number+":"+"\n");
			while (count < number){
				num=num+1;
				for (i = 2; i <= num; i++){
					if (num % i == 0) {
						break;
					}
				}
				if ( i == num){
					count = count+1;
					System.out.println(num+" ");
				}
			}
		}catch(NumberFormatException e){
			System.out.println("not a number");
		}
	}
	public static void nthPrime(int nth) {
		int num, count, i;
		num=1;
		count=0;
		try{
			while (count < nth){
				num=num+1;
				for (i = 2; i <= num; i++){
					if (num % i == 0) {
						break;
					}
				}
				if ( i == num){
					count = count+1;
				}
			}
			System.out.println("Value of nth prime: " + num);
		}catch(NumberFormatException e){
			System.out.println("not a number");
		}
	}


	public static void sort(String args[]) {
		int a[] = new int[20];
		try{
			for (int i= 0; i < args.length; i++){
				a[i]=Integer.parseInt(args[i]);//taking in an integer input throws NumberFormat Exception if not an integer
			}
			System.out.println("\n"+"sorting the prime numbers in an array:");
			for (int i = 0; i <= args.length; i++) {
				if(a[i]==2){
					System.out.println(2);
				}
				if(a[i]>2){
					int counter = 0;

					for (int n = 2; n < a[i]; n++) {
						if (a[i] % n == 0) {
							counter++;
						}
					}
					if (counter == 0) {
						System.out.println(a[i]+" ");
					}

				}
			}
			System.out.println("\n"+"sorting Even numbers in an :");
			for (int i = 0; i <= args.length; i++) {
				if(a[i]>1){
					if(a[i]% 2 == 0)

						System.out.print(a[i]+" ");
				}
			}
			System.out.println("\n");
			System.out.println("sorting odd numbers in an array :");
			for (int i = 0; i <= args.length; i++) {
				if(a[i]>1){
					if(a[i]% 2 != 0)

						System.out.print(a[i]+" ");
				}
			}
		}
		catch(NumberFormatException e){
			System.out.println("not a number");
		}

	}
	public static void reverse(int number) {

		int reverse=0;
		try{
			while( number != 0 )
			{
				reverse = reverse * 10;
				reverse = reverse + number%10;
				number = number/10;
			}

			System.out.println("\n"+"Reverse of given number is"+"\n"+reverse);

		}catch(NumberFormatException e){
			System.out.println("not a number");
		}
	}
	public static void reverse(String word)
	{
		String reverse = "";
		try{
			int length = word.length();

			for ( int i = length - 1 ; i >= 0 ; i-- )
				reverse = reverse + word.charAt(i);

			System.out.println("\n"+"Reverse of given string is:"+"\n"+reverse);
		}catch(Exception e){
			System.out.println("not valid input");
		}

	}
	public static void swapWithThirdVariable(int number1,int number2)
	{
		int temp;
		try{
			System.out.println("\n"+"Before Swapping of two numbers:"+"\n"+"a="+number1+" "+"b="+number2 );
			temp=number1;
			number1=number2;
			number2=temp;
			System.out.println("After Swapping of two numbers:"+"\n"+"a="+number1+" "+"b="+number2 );

		}catch(NumberFormatException e){
			System.out.println("not a number");
		}
	}
	public static void swap(int number1,int number2)
	{
		try{
			System.out.println("\n"+"Before Swapping of two numbers:"+"\n"+"a="+number1+" "+"b="+number2 );
			number1=number1+number2;
			number2=number1-number2;
			number1=number1-number2;
			System.out.println("After Swapping of two numbers:"+"\n"+"a="+number1+" "+"b="+number2 );

		}catch(NumberFormatException e){
			System.out.println("not a number");
		}
	}
	public static void palindrom(int number){
		try{
			int reverse=0;
			while( number != 0 )
			{
				reverse = reverse * 10;
				reverse = reverse + number%10;
				number = number/10;
			}
			if(number==(reverse)){

				System.out.println("\n"+number+":"+reverse+"\n"+"Palindrom");
			}
			else{
				System.out.println("\n"+number+":"+reverse+"\n"+"notPalindrom");
			}
		}catch(NumberFormatException e){
			System.out.println("not a number");
		}

	}
	public static void palindrom(String word){
		try{
			String reverse = "";

			int length = word.length();

			for ( int i = length - 1 ; i >= 0 ; i-- )
				reverse = reverse + word.charAt(i);
			if(word.equals(reverse)){
				System.out.println("\n"+word+":"+reverse+"\n"+"Palindrom");
			}
			else{
				System.out.println("\n"+word+":"+reverse+"\n"+"notPalindrom");
			}
		}catch(Exception e){
			System.out.println("not a valid input");
		}

	}
	public static void fibnocci(int number){
		int  last = 1, secondLast = 0, current, i;
		try{
			System.out.print(number+"  fibonocci number:" + "\n ");
			for(i = 0; i < number; i++){
				if(i < 2){
					current = i;
				} else {
					current = last + secondLast;
					secondLast = last;
					last = current;
				}
				System.out.print(current + " ");
			}
		}catch(NumberFormatException e){
			System.out.println("not a number");
		}
	}
	public static void nthFibnocci(int number){
		int  last = 1, secondLast = 0, current = 0, i;
		try{
			for(i = 0; i < number; i++){
				if(i < 2){
					current = i;
				} else {
					current = last + secondLast;
					secondLast = last;
					last = current;

				}

			}
			System.out.print("\n"+"nth fibonocci:"+current + " ");
		}catch(NumberFormatException e){
			System.out.println("not a number");
		}
	}
	public static void searchString(String s, String sub)
	{
		int count = 0,count1=0;

		try{
			for (int i = 0; i < s.length(); i++) {
				if (s.charAt(i) == sub.charAt(count)) {

					count++;
				} else {
					count = 0;
				}
				if (s == sub) {
					count1++;
				}System.out.println("Matched"+count1);
			}
			System.out.println(" not Matched");
		}catch(Exception e){
			System.out.println("not a valid input");
		}
	}

	public static void quadraticEquation(int a,int b,int c){
		System.out.println("\n Given quadratic equation:"+a+"x^2 + "+b+"x + "+c+" ");
		int d;
		double root1;
		double root2;
		try{
			d = b * b - 4 * a * c;
			if(d > 0)
			{
				System.out.println("Roots are real and unequal");
				root1 = ( - b + Math.sqrt(d))/(2*a);
				root2 = (-b - Math.sqrt(d))/(2*a);
				System.out.println("First root is:"+root1);
				System.out.println("Second root is:"+root2);
			}
			else if(d == 0)
			{
				System.out.println("Roots are real and equal");
				root1 = (-b+Math.sqrt(d))/(2*a);
				System.out.println("Root:"+root1);
			}
			else
			{
				System.out.println("Roots are imaginary");
			}
		}catch(NumberFormatException e){
			System.out.println("not a number");
		}
	}
	static void replace(String oldstr,String newstr,String file){
		try
		{
			FileReader filereader = new FileReader( file );
			BufferedReader reader = new BufferedReader( filereader );

			String line = "", oldtext = "";
			while((line = reader.readLine()) != null)
			{
				oldtext += line + "\r\n";
			}
			reader.close();
			// replace a word in a file
			int x=0,y=0;
			String result="";
			while ((x=oldtext.indexOf(oldstr, y))>-1) {
				result+=oldtext.substring(y,x);
				result+=newstr;
				y=x+oldstr.length();
			}
			result+=oldtext.substring(y);
			String newtext=result;
			oldtext=oldtext+"\n";

			//String newtext = oldtext.replaceAll(oldstr, newstr);

			FileWriter writer = new FileWriter(file);
			writer.write(newtext);writer.close();
		}
		catch (IOException ioe)
		{
			ioe.printStackTrace();
		}
	}
}

