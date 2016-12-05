package com.corejava.oops;

public class Overloading {
 public void m1(){
	 System.out.println("inside zero-argument method");
 }
 
 public void m1(int i){
	 System.out.println("inside integer argument method");
 }
 
 public void m1(double i){
	 System.out.println("inside double argument method");
 }
 
 public void m1(int i,double j){
	 long startTime = System.nanoTime();
	 System.out.println("inside integer and double argument method");
	 
	 long endTime = System.nanoTime();
		long duration = (endTime - startTime); // divide by 1000000 to get
												// milliseconds.
		double seconds = (double) duration / 1000000000.0;
		System.out.println("seconds-- > "+seconds);
 }
 
}

