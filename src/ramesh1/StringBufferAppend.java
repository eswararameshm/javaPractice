package ramesh1;

import java.lang.StringBuffer;

public class StringBufferAppend {
	public static void main(String[] args) {

		// STRING BUFFER APEND//

		StringBuffer str = new StringBuffer();

		System.out.println("new str value :" + str);
		System.out.println("new str value :" + str.hashCode());

		str.append(20);
		System.out.println("new str value 1 :" + str);
		System.out.println("new str value 1 :" + str.hashCode());

		str.append("helloo");
		System.out.println("new str value 2 :" + str);
		System.out.println("new str value 2 :" + str.hashCode());

		// STRINGB BUFFER INSERT(INT INDEX ,VALUE)//

		str.insert(2, " ramesh ");
		System.out.println("string value insert 1:" + str);
		str.insert(10, " pavan ");
		System.out.println("string value insert 2:" + str);

		// STRINGB BUFFER DELATE(INT BEGIN INDEX,INT END INDEX)//

		str.delete(1, 10);
		System.out.println("string delate:"+str);

		// STRING BUFFER REVERSE//

		str.reverse();
		System.out.println("string reverse:"+str);

		// AGAIN REVERSE(understanding purpose)//
		str.reverse();
		System.out.println("string again reverse:"+str);
		

		// STRING BUFFER TO STRING//
		str.toString();
		System.out.println("STRING BUFFER TO STRING:"+str);

		//======> STRING BUFFER ALSO CONTAIN SOME STRING RULES THERE ARE GIVEN BELLOW <====== //
		
		// int length()//
		StringBuffer sr = new StringBuffer("hai welcome to the world");
		//we are using new string buffer bcz error resolving purpose
		System.out.println("string length:"+sr.length()); 
		
        // int indexOf(String str)//
		// int lastIndexOf(String str)//
		// string buffer replace(int begin,int end, String str)//
		// String subString(int i)//
		// String subString(int i , intj)//

	}

}
