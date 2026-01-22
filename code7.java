// User function Template for Java

class Solution {
    public static ArrayList<ArrayList<Integer>> getPairs(int[] ar) {
        // code here
        Arrays.sort(ar);
        int l=0;
        int r=ar.length-1;
        
        ArrayList<ArrayList<Integer>> a=new ArrayList<>();
        
        while(l<r)
        {
            if(ar[l]+ar[r]>0){ r--;}
            
            else if(ar[l] +ar[r]<0){ l++;}
            
            else{
                a.add(new ArrayList<>(List.of(ar[l],ar[r])));
                l++;
                r--;
                
                while(l<r && ar[l]==ar[l-1])
                {
                    l++;
                }
                while(l<r && ar[r]==ar[r+1])
                {
                    r--;
                }
            }
        }
        return a;
    }
}
