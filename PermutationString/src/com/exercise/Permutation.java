package com.exercise;

public class Permutation {

	public static void main(String[] args) {

		permutation1234("", "vana");
	}
	private static void permutation1234(String prefix, String str) {
	    int n = str.length();
	    if (n == 0) System.out.println(prefix);
	    else {
	        for (int i = 0; i < n; i++)
	            permutation1234(prefix + str.charAt(i), 
	            		str.substring(0, i) + str.substring(i+1, n));
	    }
	}
}
