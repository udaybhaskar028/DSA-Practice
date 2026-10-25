class Solution {
    public String largestGoodInteger(String num) {
        char maxD = ' ';
        for(int i=0;i+2<num.length();i++){
            if(num.charAt(i) == num.charAt(i+1) && num.charAt(i+1) == num.charAt(i+2)){
                if(num.charAt(i)>maxD){
                    maxD = num.charAt(i);
                }
            }
            
        }
        if(maxD == ' '){
                return "";
        }
        String result =""+ maxD+maxD+maxD;
        return result;

    }
}