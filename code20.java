class Solution {
    public int maxProfit(int[] p) {
        // Code here
        int min=Integer.MAX_VALUE;
        int max_profit=0;
        
        for(int n:p)
        {
            if(n<min) {
                min=n;
            }
            else{
                max_profit=Math.max(max_profit, (n-min));
            }
        }
        
        return max_profit;
       
    }
}