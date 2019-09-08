package callByReference;

public class CallByReferenceConcept {

	String name = "Shankar";
	int weight = 70;

	public static void main(String[] args) {

		CallByReferenceConcept obj = new CallByReferenceConcept();
		obj.acceptValues(obj);

	}

	public void acceptValues(CallByReferenceConcept obj1) {

		System.out.println(obj1.name);
		System.out.println(obj1.weight);

	}

}
