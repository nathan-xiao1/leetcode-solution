import java.util.*;

public class Solution {
	
	public static void main(String[] args) {
		String a = "abcd,aabc,bd";
		String b = "aaa,aa";
		List<Integer> result = compareStrings(a, b);
		System.out.println((result.toString()));
	}
	
	
	public static List<Integer> compareStrings (String a, String b) {
		
		List<Integer> result = new ArrayList<>();
		
		String[] aStrs = a.split(",");
		String[] bStrs = b.split(",");
		
		int[] aFreq = new int[aStrs.length];
		
		for (int i = 0; i < aStrs.length; i++) {
			int[] freq = new int[26];
			int min = 'z';
			for (char c : aStrs[i].toCharArray()) {
				freq[c - 'a']++;
				min = Math.min(min, c - 'a');
			}
			aFreq[i] = freq[min];
		}
		
		
		for (int i = 0; i < bStrs.length; i++) {
			int[] freq = new int[26];
			int min = 'z';
			for (char c : bStrs[i].toCharArray()) {
				freq[c - 'a']++;
				min = Math.min(min, c - 'a');
			}

			int count = 0;
			for (int j = 0; j < aStrs.length; j++) {
				if (aFreq[j] < freq[min]) {
					count++;
				}
			}
			result.add(count);
		}
		
		return result;
		
	}

}
