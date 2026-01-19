class Solution {
    int maxLength(int arr[]) {
        // code here
        Map<Integer,Integer>m=new HashMap<>();
        
        int n=arr.length;int sum=0;int maxlen=0;
        
        for(int i=0;i<n;i++)
        {
            sum+=arr[i];
            
            if(sum==0){
                maxlen=i+1;
            }
            if(m.containsKey(sum))
            {
                maxlen=Math.max(maxlen,i-m.get(sum));
            }
            else{
                m.put(sum,i);
            }
        }
        
        return maxlen;
    }
}