class Solution {
    public String reverseWords(String s) {
        // Trim leading and trailing spaces
        s = s.trim();
        
        // Replace multiple spaces with a single space
        s = s.replaceAll("\\s+", " ");
        
        // Split the string into an array of words
        String[] words = s.split(" ");
        
        // Reverse the order of words
        StringBuilder sb = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            sb.append(words[i]);
            if (i > 0) {
                sb.append(" ");
            }
        }
        
        return sb.toString();
    }
}