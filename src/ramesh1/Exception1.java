package ramesh1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;

public class Exception1 {
	public static void main(String[] args) {
		int a = 10;
		int b = 0;
		String c = null;

		System.out.println("before exception");
		try {
			// System.out.println(c.length());
			// System.out.println("the given nmber divison" + a / b);
			// File f0 = new File("E://FileOperationExample.txt");
			FileWriter fwrite = new FileWriter("E://FileOperationExample.txt");
			// writing the content into the FileOperationExample.txt file
			fwrite.write("A named location used to store related information is referred to as a File.");

			// Closing the stream
			fwrite.close();
			int[] d = new int[2];
			System.out.println(d[2]);
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
			System.out.println("arthemaetic exception" + e.getMessage());
		} catch (ArithmeticException e) {
			e.printStackTrace();
			System.out.println("arthemaetic exception" + e.getMessage());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("arthemaetic exception" + e.getMessage());
		} catch (NullPointerException e) {
			e.printStackTrace();
			// System.out.println("NullPointerException "+ e.getMessage());

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("its orginalle" + e.getMessage());

		}

		System.out.println("after exception");
	}
}
