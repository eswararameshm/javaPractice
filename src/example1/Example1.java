package example1;
//Example access specifieries
public class Example1 {
	private int a=0;
	protected int b=1;
	public int c=2;
	
	private void display() {
		System.out.println("private method");
	}
	
	protected void display1() {
		System.out.println("a="+a+", b="+b+", c="+c);
	}
	
	public void display2(){
		display();
		System.out.println("a="+a+" b="+b+" c="+c);
	}
	
}
