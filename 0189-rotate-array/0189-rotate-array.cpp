class Solution {
public:
void reverseArray(vector<int> & arr , int s , int e ){

            while( s < e){

                swap(arr[s],arr[e]);
                s++;
                e--;
            }
        }
void rotate(vector<int>& nums, int k) {

        int n= nums.size();
        //edge case empty or no rotation 

        if(n == 0 || k == 0) ;

        k= k % n ;

        reverseArray(nums ,0,n -1);
        reverseArray(nums,0,k-1);
        reverseArray(nums,k,n-1);  

            
        
    
    }
};