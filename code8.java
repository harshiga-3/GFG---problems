class Solution {
    ArrayList<Integer> removeDuplicates(int[] arr) {
        // code here
        ArrayList<Integer>a=new ArrayList<>();
        
        a.add(arr[0]);
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i-1]!=arr[i])
            {
                a.add(arr[i]);
            }
        }
        
        return a;
       
    }
}
