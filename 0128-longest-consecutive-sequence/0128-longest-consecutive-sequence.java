class Solution {
    public int longestConsecutive(int[] nums) {
        int ans =0;
        HashMap <Integer,Integer> mpp = new HashMap<>();
        for(int num:nums){
            mpp.put(num,0);
        }

        for(int num:nums){
            int currlength=1;
            //forward
            int nextnum=num+1;

            while(mpp.containsKey(nextnum) && mpp.get(nextnum)==0){

                currlength++;
                mpp.put(nextnum,1);
                nextnum++;
            }

            //reverse
            int prevnum =num-1;
            while(mpp.containsKey(prevnum) && mpp.get(prevnum)==0){
                currlength++;
                mpp.put(prevnum,1);
                prevnum--;
            }
        ans = Math.max(ans,currlength);
        }
        return ans;
    }
}