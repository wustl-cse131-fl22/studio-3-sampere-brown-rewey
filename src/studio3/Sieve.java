package studio3;
import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter n");
		int n = in.nextInt();
		int[] sievearray = new int[n + 1];
		System.out.println(sievearray.length);
		for(int i=0; i < sievearray.length; i++) {
			if((i % 2 == 0) && (i != 2) || (i % 3 == 0) && (i != 3) || (i % 5 == 0) && (i != 5)|| (i % 7 == 0) && (i != 7)) {
				System.out.println(i + " is not prime");
			}
			else {
				System.out.println(i + " is prime");
			}
			
			
	
		// TODO Auto-generated method stub

	}

}}
