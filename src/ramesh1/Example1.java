package ramesh1;

import javax.print.attribute.SetOfIntegerSyntax;

public class Example1 {
	public static void main(String[] args) {
		int a = 0;
		int b = 50;
		int c=400;
		if (a > b && a>c) {
			System.out.println("a is big");
		} else if (a<b && b>c) {
			System.out.println("b is big");
		} else {
			System.out.println("c is big");

		}
	}
}
