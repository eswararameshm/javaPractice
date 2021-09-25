package ramesh1;

import java.util.Scanner;

public class Palindrum {
	public static void main(String args[]) {
		int x, number, y = 0, temp = 0;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter any number: ");
		number = s.nextInt();
		y = number;
		while (number > 0) {
			x = number % 10;
			System.out.println(x);
			number = number / 10;
			temp = temp * 10 + x;
		}
		if (temp == y) {
			System.out.println("Number is Palindrome"+temp);
		} else {
			System.out.println("not Palindrome"+temp);
		}
	}

}
