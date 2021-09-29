package ramesh1;

import java.util.Scanner;

public class Arraypositioncahnge {
	public static void main(String[] args) {
		int[] a = { 11, 22, 33, 44, 55, 66, 77, 88, 99, 12, 21, 31, 41, 51 };
		int n = a.length;
		Scanner s = new Scanner(System.in);
		System.out.println("enter any number");
		int element = s.nextInt();
		System.out.println("enter position");
		int position = s.nextInt();
		int[] b = new int[a.length+1];
		int flag=0;
		for (int i = 0; i < n; i++) {
			if (position == i) {
				b[i] = element;
				flag=1;
				b[i+1]=a[i];
			}else{
				if(flag==1){
					b[i+1]=a[i];
				}else{
					b[i] = a[i];
				}
			}
		}
		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i] + ",");
		}

	}
}

