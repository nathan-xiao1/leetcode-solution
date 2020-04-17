public class Solution {
	
	public static void main(String[] args) {
		int maxStrawberry = 10;
		int[] bushes = new int[] { 5, 1, 2, 3, 4 };
		int result = maximumNumberOfStrawberry(bushes, maxStrawberry);
		System.out.println(result);
	}

	public static int maximumNumberOfStrawberry(int[] bushes, int maxStrawberry) {

		if (bushes.length == 0) return 0;

		int[][] dp = new int[bushes.length + 2][maxStrawberry+1];

		for (int i = 2; i <= bushes.length + 1; i++) {
			for (int j = 1; j <= maxStrawberry; j++) {
				if (j >= bushes[i-2]) {
					dp[i][j] = Math.max(dp[i-2][j - bushes[i-2]] + bushes[i-2], dp[i-1][j]);
				} else {
					dp[i][j] = dp[i-1][j];
				}
			}
		}

		return dp[bushes.length+1][maxStrawberry];
	}
}
