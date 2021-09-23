package practice1;

public class Square {
	public static void main(String[] args) {
		int row = 6;
		int column = 6;
		for (int i = 0; i <= row; i++) {
			for (int j = 0; j <=row-1-i; j++) {
				System.out.print(" ");
				}
			for (int k = 0;k<=i; k++) {
			System.out.print("*");
				}
			System.out.println();
			}

		}

     	}


