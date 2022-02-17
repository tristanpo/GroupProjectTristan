package groupProject;

public class Task4 {

	public static void main(String[] args) {
		int[] numbers = { 1, 2, 3, 4, 5, 6 };
	
		int evenSum = 0;
		int oddSum = 0;
		
		for (int i = 0; i < numbers.length; i++) {
			
			if (numbers[i] % 2 == 0) {
				evenSum=evenSum+numbers[i];
			} else {
				oddSum=oddSum+numbers[i];
				
			}
			
			}
		System.out.println("The sum of all even numbers in the array is " + evenSum
				+ " and the sum of odd numbers is " + oddSum);
	}

}
