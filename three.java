class Solution {
    ArrayList<Integer> findTwoElement(int arr[]) {
        // code here
        int []c=new int[arr.length+1];
        ArrayList<Integer>l=new ArrayList<>();
        for(int i=0;i<arr.length;i++)
        {
           c[arr[i]]++; 
        }
        int misval=-1;
        int repeatval=-1;
        
        for(int i=1;i<=arr.length;i++)
        {
            if(c[i]==2)
            {
                repeatval=i;
            }
            if(c[i]==0){ misval=i;}
        }
      
       l.add(repeatval);
        l.add(misval);
        
        return l;
    }
}
