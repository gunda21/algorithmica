package com.algorithmica.leetcode;

import java.util.Arrays;
import java.util.HashMap;

public class Leetcode387 {

	public static void main(String[] args) {
		System.out.println(uniqueFirst("aa"));

	}
	
	public static int uniqueFirst(String s) {
		int[] arr = new int[26];
		for (int i = 0; i < s.length(); i++) {
			int ind = s.charAt(i) - 'a';
			arr[ind] = arr[ind] +1;
		}
		
		for (int i = 0; i < s.length(); i++) {
			int ind = s.charAt(i) - 'a';
			if(arr[ind] == 1) {
				return i;
			}
		}
		
		return -1;
	}
		

}
