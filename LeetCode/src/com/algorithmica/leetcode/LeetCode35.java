package com.algorithmica.leetcode;

public class LeetCode35 {

	public static void main(String[] args) {
		System.out.println(searchInsert(new int[] {1,3,5,6}, 5));

	}

	public static int searchInsert(int[] nums, int target) {
		int l = 0;
		int r = nums.length-1;
		while (l <= r) {
			int m = l + r / 2;
			if (nums[m] == target) {
				return m;
			}
			if (nums[m] < target)
				l = m + 1;
			else
				r = m - 1;
		}
		return l;
	}

}
