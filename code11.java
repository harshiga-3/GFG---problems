class Solution {
    boolean twoSum(int arr[], int target) {
        // code here
        int l=0;
        int r=arr.length-1;
        Arrays.sort(arr);
        while(l<r)
        {
            int sum=arr[l]+arr[r];
            if(sum==target)
            {
                return true;
            }
            else if(sum<target)
            {
                l++;
            }
            else{
                r--;
            }
        }
        return false;
    }
}