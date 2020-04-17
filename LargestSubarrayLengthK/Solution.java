import java.util.Arrays;

public class Solution {

	public static void main(String[] args) {
		int[] test = new int[] { 1, 4, 3, 2, 5 };
		int[] result = largestSubarray(test, 4);
		System.out.println(Arrays.toString(result));
	}
	
	public static int[] largestSubarray(int[] nums, int k) {
		
		if (nums.length <= k) return nums;
		int maxIndex = 0;
		
		for (int i = 1; i < nums.length - k + 1; i++) {
			for (int j = 0; j < k; j++) {
				if (nums[i + j] > nums[maxIndex + j]) {
					maxIndex = i;
					break;
				} else if (nums[i + j] < nums[maxIndex + j]) {
					break;
				}
			}
		}

		int[] result = new int[k];
		for (int i = 0; i < k; i++) {
			result[i] = nums[maxIndex + i];
		}
		
		return result;
	}

}
