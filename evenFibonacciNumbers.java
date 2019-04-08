package evenFibonacciNumbers;

public class evenFibonacciNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int term0 = 0;
		int term1 = 1;
		int temp = 0;
		int total = 0;
		 while (term1 < 4000000) 	 {
			 if (term1%2 == 0) {
				total= total + term1;
			}
		temp = term0 + term1;
		term0 = term1;
		term1 = temp;	
		} 
		System.out.println(total);
	}

}
