package inheritance5;

public class Demo5 {
	public static void main(String[] args) {
		A a =new A();
	
		System.out.println("A->");
		a.display();
		
		a=new B();
		System.out.println("B->");
		a.display();
		
		a=new C();
		System.out.println("C->");
		a.display();
		
	}

}
