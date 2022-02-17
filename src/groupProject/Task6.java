package groupProject;

public class Task6 {
public static void main(String[] args) {
	int num=8;
	boolean comp=false;
	
	for (int i=2; i<=num/2; i++) {
		if (num%i==0) {
			comp=true;
			break;
		}
	}
	if (!comp) 
		System.out.println(num+" is a prime number");
	else 
		System.out.println(num+" is not a prime number");
		
	

	
}
}
