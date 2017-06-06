package com.basic;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Methods {
	static void printPrimes(int number) {
		int i = 0,num=1,count=0;
		try{
			List<Integer> primes = new ArrayList<Integer>();
			while (count < number){
				num=num+1;
				for (i = 2; i <= num; i++){
					if (num % i == 0) {
						break;
					}
				}
				if ( i == num){
					count = count+1;
					primes.add(i);
				}
			}

			if (count == 2) {
				primes.add(i);
			}

			System.out.println("The first"+number+ "prime numbers are:");
			for(int prime : primes) {
				System.out.println(prime);
			}

		}catch(NumberFormatException e){
			System.out.println("not a number");
		}
	}
	public static void nthPrime(int nth) {
		int num=1, count, i;
		count=0;

		try{
			if(nth<=50){
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
			}
			else{
				System.out.println("please enter below 50 number");
			}
		}catch(NumberFormatException e){
			System.out.println("not a number");
		}
	}


	public static void sort(String args[]) {
		int a[] = new int[50];
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
					if(a[i]% 2 == 0){

						System.out.print(a[i]+" ");
					}else
					{
						System.out.println("\n sorting odd numbers in an array :");
						System.out.print(a[i]+" ");
					}
				}
			}
		}
		catch(NumberFormatException e){
			System.out.println("not a number");
		}

	}
	public static boolean numberOrNot(String args)
	{
		try
		{
			Integer.parseInt(args);
		}
		catch(NumberFormatException ex)
		{
			return false;
		}
		return true;
	}
	public static void reverse(String a) {

		if(numberOrNot(a)==true){
			try{
				int number=Integer.parseInt(a);
				int reverse=0;
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
		else{
			try{
				String reverse = "";
				int length = a.length();

				for ( int i = length - 1 ; i >= 0 ; i-- )
					reverse = reverse + a.charAt(i);

				System.out.println("\n"+"Reverse of given string is:"+"\n"+reverse);
			}catch(Exception e){
				System.out.println("not valid input");
			}

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
	public static void palindrom(String a){
		if(numberOrNot(a)==true){
			try{
				int number=Integer.parseInt(a);
				int reverse=0;
				while( number != 0 )
				{
					reverse = reverse * 10;
					reverse = reverse + number%10;
					number = number/10;
				}
				if(number==reverse){

					System.out.println("\n"+number+":"+reverse+"\n"+"Palindrom");
				}
				else{
					System.out.println("\n"+number+":"+reverse+"\n"+"notPalindrom");
				}
			}catch(NumberFormatException e){
				System.out.println("not a number");
			}
		}else{
			try{
				String reverse = "";

				int length = a.length();

				for ( int i = length - 1 ; i >= 0 ; i-- )
					reverse = reverse + a.charAt(i);
				if(a.equals(reverse)){
					System.out.println("\n"+a+":"+reverse+"\n"+"Palindrom");
				}
				else{
					System.out.println("\n"+a+":"+reverse+"\n"+"notPalindrom");
				}
			}catch(Exception e){
				System.out.println("not a valid input");
			}

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
	public static  int myindexOf(String string, String pattern) {
		int count=0;
		int length = string.length() - pattern.length();
		for (int index = 0; index <= length; index++) {
			if (patternMatch(string, index, pattern)) {
				//System.out.println(index);
				if(index==0)
				{
					count=count+1;
				}
				System.out.println(count);
				return index;

			}
		}

		return -1;
	}

	private static boolean patternMatch(String string, int index, String pattern) {
		int i = index;
		for (int j = 0; j < pattern.length(); j++) {
			if (string.charAt(i) != pattern.charAt(j)) {
				return false;
			}
			i++;
		}

		return true;
	}

	static Pattern match = Pattern.compile("([\\+\\-]?[0-9]*)x\\^2([\\+\\-]?[0-9]*)x([\\+\\-]?[0-9]*)");

	static String parseEquation(String formula) {
		// remove all whitespace
		try{
			formula = formula.replaceAll(" ", "");
			String a = "1";
			String b = "1";
			String c = "0";
			Matcher m = match.matcher(formula);
			if (!m.matches()) return "syntax error";
			a = m.group(1);
			if (a.length() == 0) a = "1";
			if (a.length() == 1 && (a.charAt(0) == '+' || a.charAt(0) == '-')) a += "1";
			b = m.group(2);
			if (b.length() == 0) b = "1";
			if (b.length() == 1 && (b.charAt(0) == '+' || b.charAt(0) == '-')) b += "1";
			c = m.group(3);
			int A=Integer.parseInt(a);
			int B=Integer.parseInt(b);
			int C=Integer.parseInt(c);
			int d;
			double root1,root2;
			d = B * B - 4 * A * C;
			//System.out.println(d);
			if(d > 0)
			{
				System.out.println("Roots are real and unequal");
				root1 = ( - B + Math.sqrt(d))/(2*A);
				root2 = (-B - Math.sqrt(d))/(2*A);
				System.out.println("First root is:"+root1);
				System.out.println("Second root is:"+root2);
			}
			else if(d == 0)
			{
				System.out.println("Roots are real and equal");
				root1 = (-B+Math.sqrt(d))/(2*A);
				System.out.println("Root:"+root1);
			}
			else
			{
				System.out.println("Roots are imaginary");
			}


		}catch(Exception e){
			System.out.println(e);
		}
		return formula;
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

