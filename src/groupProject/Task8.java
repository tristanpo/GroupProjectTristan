package groupProject;

public class Task8 {

	public static void main(String[] args) {
		int[] numbers= {45,78,21,94,38};
		int maximum=numbers[0];
		int minimum=numbers[0];
		
		for (int n=1; n<numbers.length; n++) {
			if (numbers[n]>maximum) {
				maximum = numbers[n];
			}else if (numbers[n]<minimum) {
				minimum = numbers[n];
			}
		}
		System.out.println("The maximum number is "+maximum+" and the minimum is "+minimum);
	}

}
