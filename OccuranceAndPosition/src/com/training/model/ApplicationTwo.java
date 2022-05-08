package com.training.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.Map.Entry;

public class ApplicationTwo {

	public static void main(String[] args) {
		//Occurance();
		Position();
	}
	public static void Occurance() {
		Map<Integer,Integer> occuranceValue=
				new TreeMap<Integer, Integer>();
		
		int arr[]= {2,5,7,2,5,6,6,2,5,8};
		for(int i=0;i<arr.length;i++)
		{
			Integer OldValue=occuranceValue.put(arr[i], 1);
			
			if(OldValue!=null)
			{
				occuranceValue.put(arr[i], (OldValue.intValue())+1);
			}
		}
		for (Entry<Integer, Integer> entry : occuranceValue.entrySet()) {
	        Integer value = entry.getValue();
	        Integer key = entry.getKey();
	        System.out.println("Number"+key+"\nData"+value);
	   }
	}
	public static void Position() {
		Map<Integer,ArrayList> positionValue=
				new TreeMap<Integer, ArrayList>();
		int arr[]= {2,5,7,2,5,6,6,2,5,8};
		ArrayList<Integer> positionList;
//		for(int i=0;i<arr.length;i++)
//		{
//			positionList=new ArrayList<>();
//			positionList.add(i);
//			ArrayList OldValue=positionValue.put(arr[i], positionList);
//			
//			if(OldValue!=null)
//			{
//				ArrayList<Integer>dummy=positionValue.get(arr[i]);
//				//System.out.println(dummy);
//				dummy.add(i);
//				System.out.println(dummy);
//				positionValue.put(arr[i], dummy);
//				
//			}
//		}
		
		for (Entry<Integer, ArrayList> entry : positionValue.entrySet()) {
	        ArrayList value = entry.getValue();
	        Integer key = entry.getKey();
	        System.out.println("Number"+key+"\nData"+value);
	   }
	}
}
