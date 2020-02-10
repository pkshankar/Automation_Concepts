package javaPrograms;

public class RemoveJunk {

	public static void main(String[] args) {

		String str = "$#@se@l%$en*i^u*()m*()";

		System.out.println("ORIGINAL STRING : " + str);
		System.out.println("JUNK FREE STRING : " + junkRemove(str));
	}

	public static String junkRemove(String str) {

		String junkFreeStr = "";
		junkFreeStr = str.replaceAll("[^a-zA-Z0-9]", "");
		return junkFreeStr;

	}

}
