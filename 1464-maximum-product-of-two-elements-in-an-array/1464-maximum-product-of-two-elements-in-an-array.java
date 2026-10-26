class Solution {
    public int maxProduct(int[] nums) {

        int largest =0;
        int sec_largest = 0;

        for(int num:nums){
            if(largest<num){
                sec_largest = largest;
                largest = num;
            }
            else {
                if(num > sec_largest ){
                    sec_largest = num;
                }
            }
        }
        return (largest-1)*(sec_largest -1);
        
    }
}