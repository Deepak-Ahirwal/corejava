package com.corejava.garbagecollection;

import java.lang.management.GarbageCollectorMXBean;
import java.lang.management.ManagementFactory;
import java.util.List;

public class JavaGarbageCollection {

	public static void main(String[] args) {
		long startTime = System.nanoTime();
		List<GarbageCollectorMXBean> gcBeanList = ManagementFactory.getGarbageCollectorMXBeans();
		System.out.println("Garbage collection names are --->");
		for(GarbageCollectorMXBean gcBean : gcBeanList){
			System.out.println("name--> "+gcBean.getName());
			System.out.println("collection---> "+gcBean.getCollectionCount());
			System.out.println("time---> "+gcBean.getCollectionTime());
			System.out.println("memory pool ---> "+gcBean.getMemoryPoolNames().toString());
			System.out.println("object name ---> "+gcBean.getObjectName());
		}
		long endTime = System.nanoTime();
		long duration = (endTime - startTime); // divide by 1000000 to get
												// milliseconds.
		double seconds = (double) duration / 1000000000.0;
		System.out.println("seconds-- > "+seconds);
	}
}
