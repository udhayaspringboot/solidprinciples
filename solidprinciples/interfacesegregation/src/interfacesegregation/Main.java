package interfacesegregation;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		SumImpl sumIm = new SumImpl();
		System.out.println("Enter the two values");
		Scanner sc = new Scanner(System.in);
		int fir = sc.nextInt();
		int las = sc.nextInt();
		sumIm.add(fir, las);
		sumIm.div(fir, las);

	}

}
