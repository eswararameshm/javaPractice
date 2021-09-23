package inheritance;

public class Tiger  implements Animal {
	 public Tiger(){
		System.out.println("Iam in Tiger constructer");
	}
	@Override
	public String makeSound() {
		String sound = "Roar Roar";
		return sound;
	}

	@Override
	public String eat() {
		String eat ="Meat";
		return eat;
	}
	public String individualMethod() {
		 String result = "Tiger is most dangerous animal";
		return result;
	}

}
