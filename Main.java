package com.basic;
import java.io.IOException;
public class Main{
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
	public static void main(String[] args) throws IOException {
		if(args.length==2){
			Methods.searchString(args[0],args[1]);
			if(numberOrNot(args[0])==true && numberOrNot(args[1])==true){
				Methods.swapWithThirdVariable(Integer.parseInt(args[0]),Integer.parseInt(args[1]));
				Methods.swap(Integer.parseInt(args[0]),Integer.parseInt(args[1]));
			}
		}
		if(args.length>=1){
			int count=0;
			for(int i=0;i<args.length;i++){
				if(numberOrNot(args[i])==true){
					count++;
				}
				if(count == args.length)
					Methods.sort(args);

			}
		}
		if(args.length==3){
			if(numberOrNot(args[0])==true && numberOrNot(args[1])==true && numberOrNot(args[2])==true){
				Methods.quadraticEquation(Integer.parseInt(args[0]),Integer.parseInt(args[1]),Integer.parseInt(args[2]));
			}else{
				Methods.replace(args[0],args[1],args[2]);
			}
		}
		if(args.length==1){
			if(numberOrNot(args[0])==true){
				Methods.palindrom(Integer.parseInt(args[0]));
				Methods.reverse(Integer.parseInt(args[0]));
				Methods.printPrimes(Integer.parseInt(args[0]));
				Methods.nthPrime(Integer.parseInt(args[0]));
				Methods.fibnocci(Integer.parseInt(args[0]));
				Methods.nthFibnocci(Integer.parseInt(args[0]));
			}

			else
			{
				Methods.reverse(args[0]);
				Methods.palindrom(args[0]);
			}
		}
	}
}








