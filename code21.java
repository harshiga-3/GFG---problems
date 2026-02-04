class Solution {
    public int getLastMoment(int n, int left[], int right[]) {
        // code here
        int ans=0;
        
        for(int c:left){
            ans=Math.max(c,ans);
        }
        for(int p:right)
        {
            ans=Math.max(ans,n-p);
        }
        
        return ans;
    }
}