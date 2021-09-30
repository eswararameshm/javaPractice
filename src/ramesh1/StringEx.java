package ramesh1;

public class StringEx {
	public static void main(String[] args) {
		
		//ADDING TO STRINGS
		// to add the two different strings
		String s = "wlcome to";
		String s1 = s.concat(" java program");
		System.out.println("concat:"+s1);
		
		//CHARACTER POSITION
		// character place
		String s2 = "ramesh";
		char c = s2.charAt(4);
		System.out.println("CHARACTER POSITION:"+c);
		
		//LENGTH
		// length of the string
		int len = s2.length();
		System.out.println("lenghth of the string:"+len);
		
		//COMPARE TO
		// compare b/w to strings
		//the values depending upon the alphabetical order and upper and lower cases  values
		String s3 = "Ramesh";
		System.out.println("compare b/w to strings:"+s2.compareTo(s3));
		
		//COMPARE TO IGNORE
		//to ignore the cases not alphabetical order.
		System.out.println("COMPARE TO IGNORE:"+s2.compareToIgnoreCase(s3));
		
		//EQUALS
		//boolean equals or equalsIgnoreCase  (output will be either true or false)
		//the cases and alphabetical order can same or not 
		//if same its true other wise false
		System.out.println("EQUALS:"+s2.equals(s3));
		
		//EQUALS IGNORE
		//only compare word alphabetical  not cases
		System.out.println("EQUALS IGNORE:"+s2.equalsIgnoreCase(s3));
		
		//STARTS WITH
		//boolean startsWith or endsWith (output will be either true or false)
		//in this program we check the StartsWith
		//the values depending upon the alphabetical order and upper and lower cases  values
		boolean result1 = s2.startsWith("ram");
		//the s2 name enter ramesh so its TRUE
		boolean result2 = s3.startsWith("ram");
		//the s3 name enter Ramesh so its FALSE
		System.out.println("STARTS WITH:"+result1);
		System.out.println("STARTS WITH:"+result2);
		
		//ENDS WITH
		//in this program we check the endsWith
		//the values depending upon the alphabetical order and upper and lower cases  values
		boolean result3 = s2.endsWith("esh");
		//the s2 name enter ramesh ending letters esh so its TRUE
		boolean result4 = s3.endsWith("rsh");
		//the s3 name enter Ramesh ending letters esh not rsh so its FALSE
		System.out.println("ENDS WITH:"+result1);
		System.out.println("ENDS WITH:"+result2);
		
		
		//INDEX OF 
		//it will shows from the position of given letter 
		//WELCOME TO JAVA PROGRAM
		//i will give the letters pr and me it will show form the position of the given word
		//the letters which can repeated .it will show from the first position of the letter
		System.out.println("INDEX OF :"+s1.indexOf("pr"));
		System.out.println("INDEX OF :"+s1.indexOf("me"));
		System.out.println("INDEX OF :"+s1.indexOf("o"));
		System.out.println("INDEX OF :"+s1.indexOf("a"));
		
		
		//"LAST INDEX OF :"
		//the letters which can repeated .it will show from the last position of the letter
		System.out.println("LAST INDEX OF :"+s1.lastIndexOf("o"));
		System.out.println("LAST INDEX OF :"+s1.lastIndexOf("a"));
		
		//REPLACE
		String s4 =s1.replace('W','e');//ex1
		//capital 'W' is not there in s1 so the output will not change.
		System.out.println(s4);
		//small 'w' is  there s1 so output will be change.
		String s5 =s1.replace('w','e');//ex2
		System.out.println("REPLACE:"+s5);
		String s6 =s1.replace('o','r');//ex3
		System.out.println("REPLACE:"+s6);
		
		
		//SUBSTRING (Single Parameter(int i))
		//starting position 
		String s7 =s1.substring(5);
		String s8 =s1.substring(0);
		String s9 =s1.substring(1);
		System.out.println("SUBSTRING-Single Parameter:"+s7);
		System.out.println("SUBSTRING-Single Parameter:"+s8);
		System.out.println("SUBSTRING-Single Parameter:"+s9);
		
		
		//SUBSTRING (double Parameter(int i, int j))
		//both Starting and Ending position
		//(starting position inclusive and ending position exclusive).
		String s10 =s1.substring(5,10);
		String s11=s1.substring(0,17);
		String s12=s1.substring(1,13);
		System.out.println("SUBSTRING-double Parameter:"+s10);
		System.out.println("SUBSTRING-double Parameter:"+s11);
		System.out.println("SUBSTRING-double Parameter:"+s12);
		
		//TO LOWER CASE
		//in a sentence all words converted into lower case
		String s13 =s1.toLowerCase();
		System.out.println("TO LOWER CASE:"+s13);
		
		//TO UPPER CASE
		//in a sentence all words converted into upper case
		String s14 = s1.toUpperCase();
		System.out.println("TO UPPER CASE:"+s14);
		
		
		//TRIM
		String s15 = "  hai ramesh  ";
		String s16 = s15.trim();//to remove the gaps(spaces) that mean before and after the word.
		String s17 = s15;//NORMAL word
		System.out.println("TRIM:"+s16);
		System.out.println("TRIM:"+s17);
		
		//[]SPLIT
		//using spaces we find the word
		String s18 ="hai ramesh welcome to the world";
		String res[] =s18.split(" ");
		System.out.println("[]SPLIT:"+res.length);
		//for each word in new line.by using for loop
		for (int i=0;i<res.length;i++)
		System.out.println("[]SPLIT:"+res[i]);
		//its coming from the word with out spaces in a same line.
		for (int i=0;i<res.length;i++)
			System.out.print("[]SPLIT:"+res[i]);
		
		
		//VOID GET CHAR
		//{int i1, int i2, char arr[],inti3}
		//String s19=s1;
		//char a[] =new char[100];
		//s1.getChars(0,15,a,2);
		//System.out.println(a[3]);
		
		
	}
}
