package ramesh1;

public class StringBuffer {
	public static void main(String[]args) {
		//string-immutable 
		String s="hello";
		System.out.println("string:"+s);	
		System.out.println("string:"+s.hashCode());
		//String buffer -mutable
		String str =new String("ramesh");
		System.out.println("new string1:"+str);
		System.out.println("new string1:"+str.hashCode());
		str ="pavan";
	    System.out.println("new string2:"+str);
		System.out.println("new string2:"+str.hashCode());
		str ="lucky";
	    System.out.println("new string3:"+str);
		System.out.println("new string3:"+str.hashCode());
	
		
		//STRINGBUFFER STR=NEW STRING BUFFER("HELOO");----->only hello character will be displayed
		//STRINGBUFFER STR=NEW STRING BUFFER();---->empty () can give only 16 characters 
		//STRINGBUFFER STR=NEW STRING BUFFER(100);------> 100 characters will be alloted 
		//STR.APPEND();=======>to add the character length by additional support..
		
	}	
}
