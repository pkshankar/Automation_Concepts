package javaConcepts;

public class CallByReference {

	int num = 10;

	String str = "Java";

	public static void main(String[] args) {

		CallByReference obj = new CallByReference();

		obj.callByRef(obj);

	}

	public void callByRef(CallByReference objNew) {

		System.out.println(objNew.num);

		System.out.println(objNew.str);

	}

}
