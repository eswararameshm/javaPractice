package ramesh1;

import java.util.Scanner;

public class EvenNumbersEx {
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any num");
		//sc.nextInt();
		int num = sc.nextInt();
		for(int i=2;i<=num;i++)
		{
			if(i%2!=0) {
				System.out.println(i+" is odd number ");
				//if(i%2==0) {
					//System.out.println(i+" is even number ");
			}
			
		}
	}

}
