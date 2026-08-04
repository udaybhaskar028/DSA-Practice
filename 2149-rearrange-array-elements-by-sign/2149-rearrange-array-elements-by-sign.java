class Solution {
    public int[] rearrangeArray(int[] nums) {

        int n= nums.length;
        int ne=1;
        int p=0;
        int[] ans= new int[n];

        for(int i=0;i<n;i++){
            if(nums[i]<0){
                ans[ne] = nums[i];
                ne= ne+2;
            }
            else{
                ans[p]=nums[i];
                p=p+2;

            }
            
        }
        return ans;
    }
}