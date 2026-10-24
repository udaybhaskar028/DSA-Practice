class Solution {
    public char findTheDifference(String s, String t) {
        HashMap< Character, Integer> map = new HashMap<>();

        for(char ch : s.toCharArray()){
            int oldcount = map.getOrDefault(ch,0);
            map.put(ch,oldcount+1);
        }

        for(char ch : t.toCharArray()){
            int count = map.getOrDefault(ch,0);
            
            if(count == 0){
                return ch;
            }
            map.put(ch,count-1);
        }
        return 'x';
    }
}