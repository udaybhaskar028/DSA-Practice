class Solution {
    public String removeOuterParentheses(String s) {

        StringBuilder sn = new StringBuilder();
        int counter = 0;
        for( char ch:s.toCharArray()){
            if(ch =='('){
                if(counter >0){
                    sn.append(ch);
                }
                    counter++;
                
            }
            else if(ch == ')'){
                counter--;
                if(counter >0)
                sn.append(ch);
                

            }
        }
        return sn.toString();
    }
}