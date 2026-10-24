class Solution {
    public int countCharacters(String[] words, String chars) {
        // Step 1: count letters in chars once
        int[] charCount = new int[26];
        for (char ch : chars.toCharArray()) {
            int index = ch - 'a';
            charCount[index]++;
        }

        int result = 0;

        for (String word : words) {
            // Step 2: count letters in this word
            int[] wordCount = new int[26];
            for (char ch : word.toCharArray()) {
                int index = ch - 'a';
                wordCount[index]++;
            }

            // Step 3: check every letter: does the word need more than chars has?
            boolean ok = true;
            for (int i = 0; i < 26; i++) {
                if (wordCount[i] > charCount[i]) {
                    ok = false;
                    break;
                }
            }

            // Step 4: good word, so add its length
            if (ok) {
                result += word.length();
            }
        }

        return result;
    }
}