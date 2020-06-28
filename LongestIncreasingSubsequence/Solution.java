class Solution {
    public int lengthOfLIS(int[] nums) {
        
        if (nums.length == 0) return 0;
        
        int[] maxAtIndex = new int[nums.length];
        Arrays.fill(maxAtIndex, 1);
        
        int result = 1;
        
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j >= 0; j--) {
                if (nums[i] > nums[j]) {
                    maxAtIndex[i] = Math.max(maxAtIndex[j] + 1, maxAtIndex[i]);
                }
            }
            result = Math.max(result, maxAtIndex[i]);
        }
        
        return result;
    }
}
