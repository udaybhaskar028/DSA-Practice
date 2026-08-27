class Solution {
    public boolean isPalindrome(String s) {
        int l=0;
        int r=s.length()-1;
        
        while(l<r){
            //left se dekh space to nhi hai 
            while(l<r && !Character.isLetterOrDigit(s.charAt(l))){
                l++;
            }
            //right se dekho space to nhi hai 
            while(r>l && !Character.isLetterOrDigit(s.charAt(r))){
                r--;
            }
            if(Character.toLowerCase(s.charAt(l)) != Character.toLowerCase(s.charAt(r))){
                return false;
            }
            l++; 
            r--;
        }
        return true;
    }
}