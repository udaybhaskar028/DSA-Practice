class Solution {
    public String reverseWords(String s) {
        StringBuilder result = new StringBuilder();
        int i = s.length() -1;

        //traverse from right to left 

        while(i >= 0){
            //skip all the trailing spaces
            while(i>=0 && s.charAt(i) == ' '){
                i--;
            }

            //if pointer moves out of bounds
            if(i<0) break;
            int j=i;
            while(j>=0 &&s.charAt(j) != ' '){
                j--;
            }
            result.append(s.substring(j+1,i+1));

            while(j>=0 && s.charAt(j)==' '){
                j--;
            }

            if(j>=0){
                    result.append(' ');

            }
            i=j;

        }
        return result.toString();
    }
}