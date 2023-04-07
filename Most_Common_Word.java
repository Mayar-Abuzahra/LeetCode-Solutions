class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        paragraph = paragraph.toLowerCase();
        paragraph = paragraph.replaceAll("\\p{Punct}", " ");
        String[] words = paragraph.split("\\s+");
        Map<String, Integer> frequency = new HashMap<>();
        Set<String> bannedSet = new HashSet<>(Arrays.asList(banned));
        int maxFrequency = 0;
        String mostFrequentWord = "";
        for (String word : words) {
            if (!bannedSet.contains(word)) {
                frequency.put(word, frequency.getOrDefault(word, 0) + 1);
                if (frequency.get(word) > maxFrequency) {
                    maxFrequency = frequency.get(word);
                    mostFrequentWord = word;
                }
            }
        }
        return mostFrequentWord;
    }
}