package learnJava8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

//class implementConsumer implements Consumer<String> {
//
//	public void accept(String str) {
//
//		System.out.println(str);
//
//	}
//}

public class ForEachConcept {

	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();
		list.add("Java");
		list.add("Selenium");
		list.add("Webservices");
		list.add("Cucumber");
		list.forEach(c -> System.out.println(c));
		

	}

}
