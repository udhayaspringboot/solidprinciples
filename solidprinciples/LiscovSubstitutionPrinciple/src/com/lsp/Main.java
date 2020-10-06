package com.lsp;

import java.util.Scanner;

public class Main {

	
	public static void main(String[] args)
	{
		
		 Main man = new Main();
		 System.out.println("Rectangle");
		 man.calculate(new Rectangle());
		 System.out.println("Squre");
		 man.calculate(new Squre());
	}
	
	void calculate(Rectangle rec)
	
	
	{
		rec.setBredth(5);
		rec.setLength(10);
		rec.area();
	}
}
