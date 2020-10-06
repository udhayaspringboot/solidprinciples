package singleresponsibilityprinciple;

import java.util.Scanner;

public class SRMain {

	public static void main(String[] args) {
		SRController srcc = new SRController();
		System.out.println("Enter the values : ");
		Scanner sc = new Scanner(System.in);
		srcc.addController(sc.nextInt(), sc.nextInt());

	}

}
