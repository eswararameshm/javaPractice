package example3;

public class Demo3 {

	public static void main(String[] args) {
		Employee e1 = new Employee();
		e1.setAge("25");
		e1.setSalary("90000");
		
		Employee e2 = new Employee();
		e2.setAge("35");
		e2.setSalary("100000");
		
		
		System.out.println(e1.age);
		System.out.println(e1.name);
		System.out.println(e1.salary);
		System.out.println(Employee.salary);//corrupted

	}

}
