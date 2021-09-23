package inheritence3;

public class Demo3 {
	public static void main(String args[]) {
		A x = new A();
		B y = new B();
		C z = new C();
		System.out.println("C a-> "+z.a);
		System.out.println("C b-> "+z.b);
		System.out.println("C c-> "+z.c);
		
		System.out.println("B a-> "+y.a);
		System.out.println("B b-> "+y.b);
		
		System.out.println("A a-> "+x.a);

	}
}
