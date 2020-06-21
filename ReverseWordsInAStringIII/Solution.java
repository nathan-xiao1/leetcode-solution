class Solution {
    public String reverseWords(String s) {
        String[] words = s.split(" ");
        for (int i = 0; i < words.length; i++) {
            words[i] = reverseWord(words[i]);
        }
        return String.join(" ", words);
    }
    
    public String reverseWord(String w) {
        StringBuilder sb = new StringBuilder();
        for (int i = w.length() - 1; i >= 0; --i) {
            sb.append(w.charAt(i));
        }
        return sb.toString();
    }
}
