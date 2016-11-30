package com.corejava.garbagecollection;

import java.lang.management.GarbageCollectorMXBean;
import java.lang.management.ManagementFactory;
import java.util.List;

public class JavaGarbageCollection {

	public static void main(String[] args) {
		List<GarbageCollectorMXBean> gcBeanList = ManagementFactory.getGarbageCollectorMXBeans();
		System.out.println("Garbage collection names are --->");
		for(GarbageCollectorMXBean gcBean : gcBeanList){
			System.out.println("name--> "+gcBean.getName());
			System.out.println("collection---> "+gcBean.getCollectionCount());
			System.out.println("time---> "+gcBean.getCollectionTime());
			System.out.println("memory pool ---> "+gcBean.getMemoryPoolNames().toString());
			System.out.println("object name ---> "+gcBean.getObjectName());
		}
		
	}
}
