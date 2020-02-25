package learnLamda;

@FunctionalInterface
interface AviationMinistry {

	void flightBasePrice();
}

//class IndiaFlight implements AviationMinistry {
//
//	@Override
//	public void flightBasePrice() {
//
//		System.out.println("INDIA FLIGHT : FLIGHT BASE PRICE METHOD");
//	}
//
//}

public class Runner {

	public static void main(String[] args) {

//		AviationMinistry aviationMinistry = new IndiaFlight();
//		aviationMinistry.flightBasePrice();
		
		//System.out.println("hello");
//		AviationMinistry aviationMinistry = new AviationMinistry() {
//			
//			@Override
//			public void flightBasePrice() {
//				
//				System.out.println("ANONYMOUS INNER CLASS : INDIA FLIGHT : FLIGHT BASE PRICE METHOD");
//			}
//		};
//		
//		aviationMinistry.flightBasePrice();
		
		AviationMinistry aviationMinistry = () -> System.out.println("LAMBA EXPRESSIONS");
		aviationMinistry.flightBasePrice();

	}

}
