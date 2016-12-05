package com.corejava.oops;

public class IsARelationShipTest1 {

	public static void main(String[] args) {
		
		/**
		 * first scenario 
		 * 
		 * Whatever the parent has by default available to the child
		 *  but whatever the child has by default not available to the parent.
		 *  Hence on the child reference we can call both parent and child class methods.
		 *  But on the parent reference we can call only methods available in the parent class
		 *  and we can’t call child specific methods.
		 */
		
		Parent prnt=new Parent();
		prnt.m1();
		//prnt.m2();
		
		/**
		 * second scenario
		 */
		Child cld = new Child();
		cld.m2();
		cld.m1();
		
		/**
		 * third scenario
		 * Parent class reference can be used to hold child class object
		 *  but by using that reference we can call only methods available
		 * in parent class and child specific methods we can’t call.
		 */
		Parent prnt1 = new Child();
		prnt.m1();
		//prnt.m2();
		
		/**
		 * fourth scenario
		 * 
		 * Child class reference cannot be used to hold parent class object
		 */
		Child cld1 = (Child) new Parent();
		cld.m2();
		cld.m1();
	}

}
