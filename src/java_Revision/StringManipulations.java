package java_Revision;

public class StringManipulations {

	public static void main(String[] args) {


		String str = "Work hard today for a glorious tomorrow";
		System.out.println("STRING LENGTH " + str.length());
		System.out.println(str.charAt(38));
		System.out.println(str.indexOf('r')); //1st occurence of 'r'
		System.out.println(str.indexOf('r', str.indexOf('r')+1)); //2nd occurence of 'r'
		System.out.println(str.indexOf('r', str.indexOf('r', str.indexOf('r')+1)+1)); //3rd occurence of 'r'
		System.out.println(str.indexOf('r', str.indexOf('r', str.indexOf('r', str.indexOf('r')+1)+1)+1)); //4th occurence of 'r'
		System.out.println(str.indexOf("hard"));
		System.out.println(str.substring(5));
		System.out.println(str.substring(5, 15));
		String newStr = "TESTING TODAY";
		System.out.println(newStr.trim());
		System.out.println(newStr.replace(" ", ""));
		System.out.println(newStr.replaceAll("NG", "GN"));
	}

}
