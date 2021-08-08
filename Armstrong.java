package assignment;

public class Armstrong {
	
	public static void main(String[] args) {
		
		int i= 153;
		int calc= 0, remainder= 0, org= i;
		
		while (i>0) {
			
			remainder= i%10;
			i= i/10;
			calc= calc + (remainder * remainder * remainder);
			
			System.out.println(calc);
		}
		
		if (calc == org) {
			
			System.out.println("It is Armstrong Number");
			
		}
		else {
			
			System.out.println("It is not Armstrong Number");
			
		}
	}
	

}
