package testpackage;

import java.util.Scanner;

public class ConditionalStatements {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your number:");
		int i = s.nextInt();
		if(i%2==0) {
			System.out.println("It is even number");
		}
		else {
			System.out.println("It is odd number");
		}
		s.close();		
	}
}
