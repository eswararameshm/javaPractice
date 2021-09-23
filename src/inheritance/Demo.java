package inheritance;

public class Demo {

	public static void main(String[] args) {
		Animal a;
		Tiger tiger = new Tiger();
		System.out.println("Tiger eat =>"+ tiger.eat());
		System.out.println("Tiger sound =>"+ tiger.makeSound());
		System.out.println("Tiger individaual =>"+ tiger.individualMethod());

		a = new Cat();
		System.out.println("Cat eat =>"+a.eat());
		System.out.println("Cat sound =>"+ a.makeSound());		

	}

}
