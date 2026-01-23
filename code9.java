// User function Template for Java

class Solution {
    public int minimumDifference(int[] arr) {
        // code here
        Arrays.sort(arr);
        int l=0;
        int r=1;
        int m=Integer.MAX_VALUE;
        
        while(l<arr.length && r<arr.length)
        {
          int diff=Math.abs(arr[l]-arr[r]);
          
         m=Math.min(diff,m);
         l++;
         r++;
        }
        return m;
    }
}