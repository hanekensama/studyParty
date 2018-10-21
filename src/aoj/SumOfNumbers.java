package aoj;

import java.util.Scanner;

public class SumOfNumbers {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			String input = scanner.next();
			if (input.equals("0")) {
				break;
			}
			
			char[] digits = input.toCharArray();
			
			int sum = 0;
			for (char d : digits) {
				sum += Integer.parseInt("" + d);
			}
			System.out.println(sum);
		}
		
		/*
		while(true) {
			int input = scanner.nextInt();
			if (input == 0) {
				break;
			}
			
			int sum = 0;
			while (input > 0) {
				sum += input % 10;
				input /= 10;
			}
			
			System.out.println(sum);
		}
		*/
		
		scanner.close();
	}
	
}
