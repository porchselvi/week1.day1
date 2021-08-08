package assignment;

public class SumOfDigits {
	public static void main(String[] args) {
	
		int remainder, number= 1235, sum= 0;
		
		while (number>0) {
			
			remainder = number%10;
			System.out.println("Remainder : "+ remainder);
			sum = sum + remainder;
			System.out.println("sum : "+ sum);
			number = number/10;
			System.out.println("quotient : "+ number);
		}
		System.out.println("sum of numbers : "+ sum);
		
	}

}
