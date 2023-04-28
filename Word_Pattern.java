import java.util.HashMap;

class Solution {
    public boolean wordPattern(String pattern, String s) {
        if (pattern.length() == 0 && s.length() == 0)
            return true;
        else if (pattern.length() == 0 || s.length() == 0)
            return false;
        
        String[] array = s.split(" ");
        if (array.length != pattern.length())
            return false;
        HashMap<Character, String> map = new HashMap<>();
        for (int i = 0; i < pattern.length(); i++) {
            char c = pattern.charAt(i);
            if (map.containsKey(c)) {
                if (!map.get(c).equals(array[i]))
                    return false;
            } else {
                if (map.containsValue(array[i]))
                    return false;
                map.put(c, array[i]);
            }
        }
        return true;
    }
}