package ramesh1;

import java.util.Scanner;

public class Stringreverse {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter any name");
		String name = s.next();
		System.out.println("given name : "+name);
		char[] reverse = new char[name.length()];
		for(int i=name.length()-1;i>=0;i--){
			reverse[name.length()-1-i]=name.charAt(i);
		}
		System.out.println("reverse name: "+String.valueOf(reverse));
	}
}
