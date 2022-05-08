package com.exercise;
import java.util.Scanner;
public class StringPermutations
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int n=s.length();
        permute(s,0,n-1);
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
        if (f == l) 
            System.out.println(s); 
        else
        { 
            for (int i = f; i <= l; i++) 
            { 
                s = swap(s,f,i); 
                permute(s, f+1, l); 
                //s = swap(s,f,i); 
            } 
        } 
    } 
}