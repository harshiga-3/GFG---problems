class Solution {
    static ArrayList<Integer> leaders(int arr[]) {
        // code here
        ArrayList <Integer> l=new ArrayList<>();
        int max=arr[arr.length-1];
        l.add(max);
        
        for(int i=arr.length-2;i>=0;i--)
        {
            if(max<=arr[i])
            {
                l.add(arr[i]);
                max=arr[i];
            }
        }
        Collections.reverse(l);
        
        return l;
        
    }
}
