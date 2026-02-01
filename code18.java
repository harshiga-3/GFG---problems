class Solution {
    public List<Integer> frequencyCount(int[] arr) {
        // code here
        List <Integer>l=new ArrayList<>();
        int n=arr.length;
        int []a=new int[n+1];
        
        for(int ch:arr){
            a[ch]++;
        }
        
        for(int i=1;i<=n;i++){
            l.add(a[i]);
        }
        
         return l;
    }
}
