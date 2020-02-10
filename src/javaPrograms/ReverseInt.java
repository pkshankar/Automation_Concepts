package javaPrograms;

public class ReverseInt {

	public static void main(String[] args) {
		
		System.out.println(reverseInt(1289765));
	}
	
	public static int reverseInt(int num) {
		
		int revNum = 0;
		int rem;

		while(num != 0) {
			
			rem = num % 10; 
			revNum = revNum* 10 + rem; 
			num = num/10; 
		}
		
		return revNum;
	}

}
