/**
 * Immutable class is good for caching purpose because you don’t need to worry about the value changes.
 * Other benefit of immutable class is that it is inherently thread-safe,
 * so you don’t need to worry about thread safety in case of multi-threaded environment.
 * 
 * 
 * 	Here I am providing a way to create immutable class in java via an example for better understanding.
	To create immutable class in java, you have to do following steps.
	Declare the class as final so it can’t be extended.
	Make all fields private so that direct access is not allowed.
	Don’t provide setter methods for variables
	Make all mutable fields final so that it’s value can be assigned only once.
	Initialize all the fields via a constructor performing deep copy.
	Perform cloning of objects in the getter methods to return a copy rather than returning the actual object
	reference.
 */

package com.corejava.finalkeyword;

import java.util.HashMap;
import java.util.Iterator;

public final class FinalTest2 {

	private final int id;

	private final String name;

	private final HashMap<String, String> testMap;

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public HashMap<String, String> getTestMap() {
		return testMap;
		// return (HashMap<String, String>) testMap.clone();
	}

	/*
	 * public FinalTest2(int i,String name,HashMap<String,String> map){
	 * this.id=i; this.name=name; //this.testMap = map;
	 * 
	 * HashMap<String,String> tempMap=new HashMap<String,String>(); String key;
	 * Iterator<String> it = map.keySet().iterator(); while(it.hasNext()){
	 * key=it.next(); tempMap.put(key, map.get(key)); } this.testMap=tempMap; }
	 */
	
	
	/*
	 * Now let’s comment the constructor providing deep copy and uncomment the constructor providing shallow copy.
	 * Also uncomment the return statement in getTestMap() method that returns the actual object reference
	 * and then execute the program once again.
	 * 
	 */
	

	/**
	 * Constructor performing Shallow Copy
	 * 
	 * @param i
	 * @param n
	 * @param hm
	 */

	public FinalTest2(int i, String n, HashMap<String, String> hm) {
		System.out.println("Performing Shallow Copy for Object initialization");
		this.id = i;
		this.name = n;
		this.testMap = hm;
	}
	
/*
 * 	As you can see from the output, HashMap values got changed because of shallow copy in
 * 	the constructor and providing direct reference to the original object in the getter function.
	That’s all for how to create immutable class in java.
	If I have missed something here, feel free to comment.
*/

	/**
	 * To test the consequences of Shallow Copy and how to avoid it with Deep
	 * Copy for creating immutable classes
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		HashMap<String, String> h1 = new HashMap<String, String>();
		h1.put("1", "first");
		h1.put("2", "second");

		String s = "original";

		int i = 10;

		FinalTest2 test = new FinalTest2(i, s, h1);

		// Lets see whether its copy by field or reference
		System.out.println(s == test.getName());
		System.out.println(h1 == test.getTestMap());
		// print the test values
		System.out.println("ce id:" + test.getId());
		System.out.println("ce name:" + test.getName());
		System.out.println("ce testMap:" + test.getTestMap());
		// change the local variable values
		i = 20;
		s = "modified";
		h1.put("3", "third");
		// print the values again
		System.out.println("ce id after local variable change:" + test.getId());
		System.out.println("ce name after local variable change:" + test.getName());
		System.out.println("ce testMap after local variable change:" + test.getTestMap());

		HashMap<String, String> hmTest = test.getTestMap();
		hmTest.put("4", "new");

		System.out.println("ce testMap after changing variable from accessor methods:" + test.getTestMap());

	}

}