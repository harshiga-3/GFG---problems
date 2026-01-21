
class Solution {
    public boolean isSubset(int a[], int b[]) {
        // Your code here
        Arrays.sort(a);
        Arrays.sort(b);int c=0;
        
        int l=0;
        int r=0;
        while(l<a.length && r < b.length)
        {
            if(a[l]<b[r])
            {
                l++;
            }
            else if(a[l]==b[r])
            {
                l++;
                r++;
                
            }
            else{
                return false;
            }
        }
        return r==b.length;
    }
}
