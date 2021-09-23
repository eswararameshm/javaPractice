package inhertance2;

public class Demo2{
		public static void main(String[] args) {
			Animal a;
			Tiger tiger = new Tiger();
			System.out.println("Tiger eat =>"+ tiger.eat());
			System.out.println("Tiger sound =>"+ tiger.makeSound());
			System.out.println("Tiger individaual =>"+ tiger.individualMethod());
			System.out.println("Tiger has mouth =>"+ tiger.hasMouth);
			System.out.println("Tiger has nose =>"+ tiger.hasNose);
			System.out.println("Tiger has eyes =>"+ tiger.hasEyes);
			Cat cat = new Cat();
			System.out.println("Cat eat =>"+cat.eat());
			System.out.println("Cat sound =>"+ cat.makeSound());	
			//System.out.println("Cat individaual =>"+ cat.individualMethod());
			System.out.println("Cat has mouth =>"+ cat.hasMouth);
			System.out.println("Cat has nose =>"+ cat.hasNose);
			System.out.println("Cat has eyes =>"+cat.hasEyes);

		}

	}
