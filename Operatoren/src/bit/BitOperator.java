package bit;
public class BitOperator {
	
	public static void main(String[] args) {
		
		
		//Bit OR
		int a = 0B1100;  //0B->
		int b = 0B1001;
		
		
		
		System.out.println(Integer.toBinaryString(a | b));
		
		// Bit AND
		
		int a2 = 0B1001;
		int b2 = 0B1100;
		System.out.println(Integer.toBinaryString(a2 & b2));
		
		// Bit Negation
		
		byte a3 = 0B1100;
		System.out.println(Integer.toBinaryString(~a3));
		
		// Bit XOR
		int a4 = 0B1001;
		int b4 = 0B1100;
		
		System.out.println(Integer.toBinaryString(a4 ^ b4));
		
	}

}
