package leetcode;

public class TimeToTypeAString {

	public static void main(String[] args) {
		String keyboard = "abcdefghijklmnopqrstuvwxy";
		String text = "cba";
		int result = timeToTypeAString(keyboard, text);
		System.out.println(result);
	}
	
	public static int timeToTypeAString(String keyboard, String text) {
		
		int cPos = 0;
		int time = 0;
		
		// Store the keyboard position for each character
		int[] keyboardPos = new int[26];
		for (int i = 0; i < keyboard.length(); i++) {
			keyboardPos[keyboard.charAt(i) - 'a'] = i;
		}
		
		// For each character in text, 
		// time taken = current position - character position in keyboard
		for (char c : text.toCharArray()) {
			time += Math.abs(cPos - keyboardPos[c - 'a']);
			cPos = keyboardPos[c - 'a'];
		}
		
		return time;
	}

}
