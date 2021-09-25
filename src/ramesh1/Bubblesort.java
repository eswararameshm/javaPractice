package ramesh1;

public class Bubblesort {
	public static void main(String[] args) {
		int[] a = { 75, 23, 55, 66, 11, 9, 22, 99, 27, 24, 29, 59, 69, 80 };
		int n = a.length;
		for (int i = 0; i < n - 1; i++) {
			int flag = 0;
			for (int j = 0; j < n - 1 - i; j++) {
				if (a[j] > a[j + 1]) {
					int temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
					flag = 1;
				}
			}
			if (flag == 0) {
				break;
			}
		}
		for (int i = 0; i < n - 1; i++) {
			System.out.print( a[i]+",");
		}
	}
}
