package constructorLogic;

public class ClassChild extends ClassParent {

	public ClassChild() {
		
		super("JOHN", 25);

		System.out.println("INSIDE CHILD CLASS DEFAULT CONSTRUCTOR");
	}

	public static void main(String[] args) {

		ClassChild childObj = new ClassChild();

	}

}
