package javaPrograms;

public class StringReverseWords {

	public static void main(String[] args) {
		
		String str = "THIS IS ECLIPSE";
		
		System.out.println("INPUT STRING : " + str);
		System.out.println("OUTPUT STRING : " + findReverse(str));
		
	}
	
	public static String findReverse(String str) {
		
		String strArr[] = str.split(" ");
		String revStr = "";
		for(int counter = strArr.length-1; counter>=0; counter--) {
			
			
			revStr = revStr + strArr[counter] +" ";
		}
		
		return revStr;
	}

}
