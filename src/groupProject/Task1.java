package groupProject;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int[] num=new int[4];
		 for (int i=0; i<num.length; i++) {
			 System.out.println("Please enter number");
			 num[i]=input.nextInt();
			
		 }
		 int sum=(num[0]+num[1]+num[2]+num[3]);
		System.out.println("The sum of all stored elements is equal to "+sum);
	}
	
}
