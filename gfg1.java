class Solution {
    public int kthElement(int a[], int b[], int k) {
        // code here
        int []ans=new int[a.length+b.length];
        int n= a.length;int m=b.length; 
        int l=0;int j=0;
        int r=0;
        
        while(l<n && r<m )
        {
            if(a[l]<b[r])
            {
                ans[j++]=a[l];
                l++;
            }
            else{
                ans[j++]=b[r];
                r++;
            }
        }
        
        while(l<n) {
            ans[j++]=a[l];
            l++;
        }
        
        while(r<m)
        {
            ans[j++]=b[r];
            r++;
        }
        
        return ans[k-1];
    }
}