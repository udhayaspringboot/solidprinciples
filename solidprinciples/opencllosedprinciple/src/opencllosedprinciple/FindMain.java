package opencllosedprinciple;

import java.util.Scanner;

public class FindMain {

	public static void main(String[] args) {
		
		FindSumImpl fsi = new FindSumImpl();
		System.out.println("Enter two numbers to find sum and difference ");
		Scanner sc = new Scanner(System.in);
		int as = sc.nextInt();
		int ab = sc.nextInt();
		//fsi.sum(as, ab);
		fsi.diff(as, ab);

	}

}
