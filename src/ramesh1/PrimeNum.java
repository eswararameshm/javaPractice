package ramesh1;

import java.util.Scanner;

public class PrimeNum {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any num");
		int n = sc.nextInt();
		for(int i=2;i<n;i++) {
			if(isPrime(i)) {
				System.out.println(i+" is prime");
				
			}
		
		}
	}

	public static boolean isPrime(int n) {
		boolean prime = true;
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				prime = false;
				break;
			}
		}
		return prime;

	}

}
