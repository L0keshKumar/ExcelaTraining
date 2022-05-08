package com.exercise.alternative;

public class Permute {

	public static void main(String[] args) {

		String str="hello";
		int n=str.length();
		permute(str,0,n-1);
	}
	private static String swap(String s, int i, int j) 
    { 
        char temp; 
        char[] c = s.toCharArray(); 
        temp = c[i] ; 
        c[i] = c[j]; 
        c[j] = temp; 
        return String.valueOf(c); 
    } 
    private static void permute(String s, int f, int l) 
    { 
        if (f == l/2) {
            System.out.println(s);
            System.out.println(new StringBuffer(s).reverse().toString());
        }
        else
        { 
            for (int i = f; i <= l; i++) 
            { 
                s = swap(s,f,i); 
                permute(s, f+1, l); 
                s = swap(s,f,i); 
            } 
        } 
    } 

}
