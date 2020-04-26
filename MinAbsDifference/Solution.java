import java.util.*;

public class Solution {

	public static void main(String[] args) {
		int[] input = new int[] { 1, 2, 6, 9, 3, 10 };
		int result = minAbsDifference(input);
		System.out.println(result);
	}
	
	public static int minAbsDifference(int[] loads) {
		
		int sum = Arrays.stream(loads).sum();
		int targetLoad = sum / 2;
		
		int[][] dp = new int[loads.length+1][targetLoad+1];
		
		for (int i = 1; i <= loads.length; i++) {
			for (int j = 1; j <= targetLoad; j++) {
				if (j - loads[i-1] < 0) {
					dp[i][j] = dp[i-1][j];
				} else {
					dp[i][j] = Math.max(dp[i-1][j-loads[i-1]] + loads[i-1], dp[i-1][j]);
				}
			}
		}
    
		return sum - dp[loads.length][targetLoad] * 2;
	}
}
