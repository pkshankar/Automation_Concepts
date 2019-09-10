package constructorLogic;

public class ClassParent {

	String name;
	int age;

	public ClassParent() {

		System.out.println("INSIDE PARENT CLASS DEFAULT CONSTRUCTOR");
	}

	public ClassParent(String name, int age) {

		System.out.println("INSIDE PARENT CLASS PARAMETERIZED CONSTRUCTOR");
		this.name = name;
		this.age = age;
		System.out.println(this.name);
		System.out.println(this.age + 1);
	}

}
