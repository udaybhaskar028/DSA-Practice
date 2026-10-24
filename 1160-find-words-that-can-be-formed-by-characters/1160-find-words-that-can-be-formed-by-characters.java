class Solution {
    public int countCharacters(String[] words, String chars) {
        int[] key = new int[26];

        for(char ch: chars.toCharArray()){
            int index = ch-'a';
            key[index]++;
        }

        int result =0;

        for( String word:words){
            if(word.length() >chars.length())continue;
            int[] keyclone = key.clone();
            boolean ok=true;

            for(char ch : word.toCharArray()){
                int index = ch -'a';
                keyclone[index]--;
                if(keyclone[index]<0) ok=false;
            }
            if(ok)result+=word.length();

        }
        return result;
        
    }
}