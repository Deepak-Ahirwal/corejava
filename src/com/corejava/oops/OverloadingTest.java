package com.corejava.oops;

public class OverloadingTest extends Overloading{
	public static void main(String[] args) {
		OverloadingTest t1= new OverloadingTest();
		t1.m1();
		t1.m1(1);
		t1.m1(1.2);
		t1.m1(2, 2d);
	}
	
}
