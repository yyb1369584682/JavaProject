package test.interfacedemon;

public class Test implements Person,Student {
	public void spark(){}

	public static void main(String[] args) {
		System.out.println(Person.name+Student.name);
	}
}
