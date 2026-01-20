class Solution {
    // Function to find equilibrium point in the array.
    public static int findEquilibrium(int arr[]) {
        // code here
        
        int sum=0;
        for(int n:arr) sum+=n;
        
        int leftsum=0;
        for(int i=0;i<arr.length;i++)
        {
          int rightsum=sum-arr[i]-leftsum;
          
          if(rightsum==leftsum) return i;
          
          leftsum+=arr[i];
        }
        return -1;
    }
}
