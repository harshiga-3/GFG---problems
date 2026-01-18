// User function Template for Java
import java.util.*;
class Solution {
    public int longestSubarray(int[] arr, int k) {
        // code here
        Map<Integer,Integer>m=new HashMap<>();
        int sum=0;int maxlen=0;
        for(int i=0;i<arr.length;i++)
        {
            
            sum+=arr[i];
            if(sum==k)
            {
              maxlen=i+1;  
            }
            
            if(m.containsKey(sum-k))
            {
                maxlen=Math.max(maxlen,i-m.get(sum-k));
            }
           
            
            if(!m.containsKey(sum))
            {
                 m.put(sum,i);
            }
            
        }
        
        return maxlen;
    }
}
