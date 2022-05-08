package com.training;

import java.util.*;/*ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;*/
import java.util.Map.Entry;

import com.training.model.Value;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,Value> values=new TreeMap<Integer, Value>();
		int arr[]= {2,5,7,2,5,6,2,5,8};
		List<Integer> arrList;
		for(int i=0;i<arr.length;i++) {
			int ctr=0;
			arrList=new ArrayList<Integer>();
			for(int j=0;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					ctr++;
					arrList.add(j);
				}
				values.put(arr[i], new Value(arr[i], ctr, arrList));
			}
		}
		for (Entry<Integer, Value> entry : values.entrySet()) {
	        Value value = entry.getValue();
	        Integer key = entry.getKey();
	        System.out.println("Number"+key+"\nData"+value);
	   }
	}

}
