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
            // Step 2: a word longer than chars can never fit, so skip it
            if (word.length() > chars.length()) {
                continue;
            }

            // Step 3: fresh copy of the counts for this word
            int[] available = charCount.clone();

            // Step 4: use up one letter at a time; stop at the first shortage
            boolean ok = true;
            for (char ch : word.toCharArray()) {
                int index = ch - 'a';
                available[index]--;
                if (available[index] < 0) {
                    ok = false;
                    break;
                }
            }

            if (ok) {
                result += word.length();
            }
        }

        return result;
    }
}