package java_Revision;

public class SwapStrWithoutTempVar {

	public static void main(String[] args) {
		
		String str1 = "JAVA";
		String str2 = "SELENIUM";
		str1=str1.concat(str2); //JAVASELENIUM
		str2=str1.substring(0, str1.length()-str2.length()); //JAVA
		str1=str1.substring(str2.length());
		System.out.println(str1);
		System.out.println(str2);
	}

}
