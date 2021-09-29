package ramesh1;

import java.util.Scanner;

public class Arrayadittion {
	public static void main(String[] args) {
		int[] a = { 11, 22, 33, 44, 55, 66, 77, 88, 99, 12, 21, 31, 41, 51 };
		int n = a.length;
		Scanner s = new Scanner(System.in);
		System.out.println("enter any number");
		int element = s.nextInt();
		int[] b = new int[a.length + 1];
		for (int i = 0; i < n; i++) {
			b[i] = a[i];
		}
		b[a.length] = element;
		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i] + ",");
		}

	}
}
