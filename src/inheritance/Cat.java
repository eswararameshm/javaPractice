package inheritance;

public class Cat implements Animal {
	 public Cat(){
		System.out.println("Iam in Cat constructer");
	}
	

	@Override
	public String makeSound() {
		String sound = "meow meow";
		return sound;
	}

	@Override
	public String eat() {
		String eat ="meat";
		return eat;
	}
}
