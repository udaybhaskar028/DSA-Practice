class Solution {
    public int characterReplacement(String s, int k) {
        
        int[] freq = new int [26];
        int left =0;
        int maxfreq = 0;
        int maxlen =0;

        for(int right =0;right<s.length();right++){
            // jo dekha vo update krdo
            freq[s.charAt(right) -'A']++;
            maxfreq = Math.max(maxfreq, freq[s.charAt(right)-'A']);

            int windowlength = right-left +1;
            //window chhots krna hai, kyunki k se zyada change lagenge
            if(windowlength-maxfreq >k){
                freq[s.charAt(left)-'A']--;
                left ++;
            }

            windowlength = right-left +1;
            maxlen = Math.max(maxlen,windowlength);

        }
        return maxlen;

    }
}