package groupProject;

public class Task9 {
public static void main(String[] args) {
	int arr[] = { 1, 6, 10, 99, 101, 2, 13, 33, 3, 85 };
	  int largest = arr[0];
	  int secondLargest = arr[0];
	   
	  System.out.println("The given array is:" );
	  for (int i = 0; i < arr.length; i++) {
	   System.out.print(arr[i]+" , ");
	  }
	  for (int i = 0; i < arr.length; i++) {
	 
	   if (arr[i] > largest) {
	    secondLargest = largest;
	    largest = arr[i];
	 
	   } else if (arr[i] > secondLargest) {
	    secondLargest = arr[i];
	 
	   }
	  }
	 
	  System.out.println("\nSecond largest number is: " + secondLargest);
}
}