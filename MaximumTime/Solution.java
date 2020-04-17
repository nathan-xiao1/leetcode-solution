public class Solution {

	public static void main(String[] args) {
		String[] testCases = new String[] {
				"?4:5?",
				"23:5?",
				"2?:22",
				"0?:??",
				"??:??"
		};
		
		for (String input : testCases) {
			String result = maximumTime(input);
			System.out.println(result);
		}
	
	}
	
	public static String maximumTime(String s) {
		
		char[] time = s.toCharArray();
		if (time[4] == '?') time[4] = '9';
		if (time[3] == '?') time[3] = '5';
		if (time[1] == '?') time[1] = (time[0] == '?' || time[0] == '2') ? '3' : '9';
		if (time[0] == '?') time[0] = time[1] == '3' ? '2' : '1';
		
		return new String(time);
	}

}
