package java_Revision;

public class RemoveJunkCharactersString {

	public static void main(String[] args) {

		System.out.println(
				removeJunkFromString("!@#$%^&*(SHANKAR*(&%$#@! IS&*^&_+*&^% AN&^%$^*() INDIAN^*() BY$%&&* BIRTH"));

	}

	public static String removeJunkFromString(String str) {

		return str.replaceAll("[^a-zA-Z0-9\\s]", "");
	}

}
