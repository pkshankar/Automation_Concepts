package genericsBounded;

public class Car<E> {
	
	public static <E> void driveCar(E e) {
		
		System.out.println("DRIVING CAR " + e);
	}

}
