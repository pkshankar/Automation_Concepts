package javaConcepts;


import java.util.HashSet;



public class HashSetUserDefined  {

	int empNo;

	String empName;

	public HashSetUserDefined(int empNo, String empName) {

		this.empNo = empNo;

		this.empName = empName;

	}

		public static void main(String[] args) {

		HashSet<HashSetUserDefined> hsObj = new HashSet<HashSetUserDefined>();

		HashSetUserDefined obj1 = new HashSetUserDefined(105002, "Peter");

		HashSetUserDefined obj2 = new HashSetUserDefined(105000, "Tom");

		HashSetUserDefined obj3 = new HashSetUserDefined(105003, "Derek");

		HashSetUserDefined obj4 = new HashSetUserDefined(104505, "Ronald");

		HashSetUserDefined obj5 = new HashSetUserDefined(103451, "Nolty");

		hsObj.add(obj1);

		hsObj.add(obj2);

		hsObj.add(obj3);

		hsObj.add(obj4);

		hsObj.add(obj5);

		for (HashSetUserDefined hs : hsObj) {

			System.out.println(hs.empNo + " " + hs.empName);
		}
		
		
	}

	

}
