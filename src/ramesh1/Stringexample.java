package ramesh1;

public class Stringexample {
	public static void main(String[]args) {
		String p="Test";
		String q="test";//premative type 
		String r=new String("test");//wrapper type
		System.out.println(p==q);
		System.out.println(p==r);
		System.out.println(p.equals(q));
		System.out.println(p.equals(r));
		System.out.println(p.equalsIgnoreCase(r));
		System.out.println(p.equalsIgnoreCase(q));
		
		
	}

}
