package javaConcepts;

public class StringOpposite {

	public static void main(String[] args) {

		String str = "This is Eclipse";
		String strArray[] = str.split(" ");
		String strOpposite="";
		for (int i = strArray.length-1; i >= 0; i--) {

			strOpposite = strOpposite + strArray[i]+" ";
		}
		
		System.out.println(strOpposite);
	}

}
