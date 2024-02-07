package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Please input n.");
		int n = in.nextInt();
		int[] allNumbers;
		allNumbers = new int[n];
		int list = 0;
		while (list <n)
		{
			allNumbers[list] = list+1;
			System.out.print(allNumbers[list] + ", ");
			list = list +1;
		}
		boolean[] primeNumbersBoolean;
		primeNumbersBoolean = new boolean[n];
		list =0;
		while (list <n)
		{
			primeNumbersBoolean[list] = true;
			list = list +1;
		}	
		list =2;
		for (list =2; list<n; list = list +2)
			{
					primeNumbersBoolean[list]=false;
			}	
		
		list =2;
		while (list <n)
		{
			System.out.println(primeNumbersBoolean[list] + ", ");
			list = list +1;
		}















	}

}
