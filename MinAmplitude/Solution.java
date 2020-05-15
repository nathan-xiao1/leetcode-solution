import java.util.Arrays;

public class Solution {
	
	public static void main(String[] args) {
		
		int[] test = new int[] { -1, 3, -1, 8, 5 ,4 };
		int result = minAmplitude(test);
		System.out.println(result);
		
	}
	
	public static int minAmplitude(int[] input) {
		if(input.length <=4) return 0;
        Arrays.sort(input);
        int minAmp = Integer.MAX_VALUE;
        for(int i = 0; i < 4; i++){
            minAmp = Math.min(minAmp, input[input.length-1-i]-input[3-i]);
        }
        return minAmp;
 	}

}
