package java_Revision;

interface phone {

	void call();
}

//class Iphone implements phone {
//
//	@Override
//	public void call() {
//
//		System.out.println("IPHONE - CALL");
//
//	}
//
//}

public class learnLambda {

	public static void main(String[] args) {

//		phone p = new Iphone();
//		p.call();

//		phone p = new phone() {
//			
//			public void call() {
//				
//				System.out.println("IPHONE - CALL");
//			}
//		};
//		
//		p.call();

		phone p = () -> System.out.println("IPHONE - CALL");
		p.call();

	}

}
