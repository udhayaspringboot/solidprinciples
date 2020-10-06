package com.lsp;

public class Rectangle {
	
	int length;
	int bredth;
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public int getBredth() {
		return bredth;
	}
	public void setBredth(int bredth) {
		this.bredth = bredth;
	}
	
	public void area()
	{
		System.out.println("Area  is " + (length * bredth));
	}

}
