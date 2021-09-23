package example3;

public class Employee {
	public String age;
	public static String salary;
	public final String name = "Ramesh";
	
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public static String getSalary() {
		return salary;
	}
	public static void setSalary(String salary) {
		Employee.salary = salary;
	}
	public String getName() {
		return name;
	}	
}
