package assignment;

public class FibonacciSeries {
	
	public static void main(String[] args) {
		
		int range = 7;
		int fnum = 0;
		int snum = 1;
		int sum= 0;
		
		System.out.println("Fibonacci Number is " + range);
		
		for (int i= 0; i<range; i++) {
			
			sum= fnum + snum;
			fnum= snum;
			snum= sum;
			System.out.println(sum);
			
		}
		
	}

}
