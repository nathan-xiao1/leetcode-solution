package leetcode;

import java.util.*;

public class Solution {

	public static void main(String[] args) {
		int[] testCase1 = new int[] {1, 1, 2, 45, 46, 46};
		int[] testCase2 = new int[] {1, 1};
		int[] testCase3 = new int[] {1, 5, 1, 5};
		int[] testCase4 = new int[] {1, 46, 46, 1, 46, 46, 1, 46, 1, 1, 46};
		System.out.println("testCase1: Expected: 2, Actual: " + twoSumUnique(testCase1, 47));
		System.out.println("testCase2: Expected: 1, Actual: " + twoSumUnique(testCase2, 2));
		System.out.println("testCase3: Expected: 1, Actual: " + twoSumUnique(testCase3, 6));
		System.out.println("testCase4: Expected: 1, Actual: " + twoSumUnique(testCase4, 47));
	}
	
	public static int twoSumUnique(int[] nums, int target) {
		
		Set<Integer> used = new HashSet<Integer>();
		Set<Integer> seen = new HashSet<Integer>();
		int result = 0;
		
		for (int num : nums) {
			int complement = target - num;
			if (seen.contains(complement) && !used.contains(num) && !used.contains(complement)) {
				result++;
				used.add(num);
			} else {
				seen.add(num);
			}
		}
		
		return result;
	}

}
