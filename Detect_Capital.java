class Solution {
public static boolean detectCapitalUse(String word) {
    int counterUppercaseLetters = 0;

    for (int i = 0; i < word.length(); i++) {
        if (word.charAt(i) == Character.toUpperCase(word.charAt(i))) {
            counterUppercaseLetters++;
        }
    }

    return counterUppercaseLetters == 0 ||
            counterUppercaseLetters == word.length() ||
            (counterUppercaseLetters == 1 && word.charAt(0) == Character.toUpperCase(word.charAt(0)));
}
}