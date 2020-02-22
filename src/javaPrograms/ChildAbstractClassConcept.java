package javaPrograms;

public class ChildAbstractClassConcept extends AbstractClassConcept {

	public static void main(String[] args) {

		AbstractClassConcept obj = new ChildAbstractClassConcept();
		obj.human();
	}

	public void human() {
		
		System.out.println("HUMAN - CHILD CLASS");
	}
}
