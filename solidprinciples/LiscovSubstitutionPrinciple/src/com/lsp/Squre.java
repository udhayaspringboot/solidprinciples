package com.lsp;

public class Squre extends Rectangle {
	@Override
	public void setLength(int length) {
		super.setBredth(length);
		super.setLength(length);
	}
	@Override
	public void setBredth(int bredth) {
		super.setBredth(bredth);
		super.setLength(bredth);
	}

}
