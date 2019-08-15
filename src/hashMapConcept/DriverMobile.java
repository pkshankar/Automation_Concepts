package hashMapConcept;

import java.util.HashMap;
import java.util.Map;

public class DriverMobile {

	public static void main(String[] args) {

		HashMap<Integer, Mobile> hMapMobObj = new HashMap<Integer, Mobile>();

		hMapMobObj.put(1, new Mobile("Nokia", 2013, 200));

		hMapMobObj.put(2, new Mobile("Samsung", 2010, 450));

		hMapMobObj.put(3, new Mobile("Apple", 2017, 800));

		hMapMobObj.put(2, new Mobile("Sony", 2011, 650));

		hMapMobObj.put(3, new Mobile("Lenovo", 2018, 230));

		for (Map.Entry<Integer, Mobile> mobDetails : hMapMobObj.entrySet()) {

			int key = mobDetails.getKey();

			Mobile value = mobDetails.getValue();
			
			System.out.println(key);

			System.out.println(value.mName + " " + value.yearOfManf + " " + value.priceUsd);

		}

	}

}
