class Solution {
    void reverse(int[] nums,int start){
        int i=start;
        int j=nums.length-1;
        while(i<j){
            swap(nums,i,j);
            i++;
            j--;
        }
    }

     void swap(int[] nums,int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }

    public void nextPermutation(int[] nums) {
        int pivot = -1;
        int n= nums.length;
        for(int i=n-2;i>=0;i-- ){
            if(nums[i]<nums[i+1]){
            pivot=i;
            break;
        }
            }    
        if(pivot==-1){
                reverse(nums,0);
                return;
        }
        
        for( int i=n-1;i>pivot;i--){
            if(nums[i]>nums[pivot]){
                swap(nums,i,pivot);
                break;
            }
        }

        reverse(nums,pivot+1);


    
    }
}