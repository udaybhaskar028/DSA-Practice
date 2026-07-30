class Solution {
    public int maxProfit(int[] arr) {
      int min = arr[0];
      int maxprofit =0;

      for( int i=0;i<arr.length;i++){
        int profit = arr[i]-min;
        min= Math.min(min , arr[i]);
        maxprofit =Math.max(maxprofit, profit);
        
      }
       return maxprofit; 
    }
}