class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n = s1.length(), m = s2.length();
        if (n > m) return false;

        int[] need = new int[26];
        int[] win  = new int[26];
        for (int i = 0; i < n; i++) {
            need[s1.charAt(i) - 'a']++;
            win[s2.charAt(i) - 'a']++;
        }

        int matches = 0;
        for (int i = 0; i < 26; i++)
            if (need[i] == win[i]) matches++;
        if (matches == 26) return true;

        for (int right = n; right < m; right++) {
            int in  = s2.charAt(right) - 'a';
            int out = s2.charAt(right - n) - 'a';

            if (win[in] == need[in]) matches--;
            win[in]++;
            if (win[in] == need[in]) matches++;

            if (win[out] == need[out]) matches--;
            win[out]--;
            if (win[out] == need[out]) matches++;

            if (matches == 26) return true;
        }
        return false;
    }
}