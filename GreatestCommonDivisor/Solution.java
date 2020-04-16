import java.util.*;

public class Solution {

	public static void main(String[] args) {
		
		int maxGCD = Integer.MIN_VALUE;
		int minGCD = Integer.MAX_VALUE;
		
		Scanner input = new Scanner(System.in);
		
		int nLevels = input.nextInt();
		input.nextInt();
		
		for (int level = 0; level < nLevels; level++) {
			int a = input.nextInt();
			int b = input.nextInt();
			int gcd = gcd(a, b);
			maxGCD = Math.max(maxGCD, gcd);
			minGCD = Math.min(minGCD, gcd);
		}
		
		System.out.println(maxGCD - minGCD);
		
		input.close();
	}
	
	public static int gcd(int a, int b) {
		if(b == 0) return a; 
		return gcd(b, a % b);
	}

}
