import java.util.*;

public class Solution {

	public static void main(String[] args) {
		int[] S = new int[] { 1, 2, 6, 5, 3 };
		int[] E = new int[] { 5, 5, 7, 6, 8 };
		int result = minNumberOfChairs(S, E);
		System.out.println(result);
	}
	
	public static int minNumberOfChairs(int[] entries, int[] exits) {
  
		Arrays.sort(entries);
		Arrays.sort(exits);
		
		int entryPointer = 0;
		int exitPointer = 0;
		int chairs = 0;
		int min = 0;
		
		while (entryPointer < entries.length) {
			if (entries[entryPointer] < exits[exitPointer]) {
				chairs++;
				entryPointer++;
			} else {
				chairs--;
				exitPointer++;
			}
			min = Math.max(min, chairs);
		}
		
		return min;
	}
  
}
