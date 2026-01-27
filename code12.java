class Solution {
    public int moreFrequent(List<Integer> arr, int x, int y) {
        // code here
        int c=0;int d=0;
        for(int n:arr)
        {
            if(n==x) c++;
            else if(n==y) d++;
        }
        
       if(c>d){ return x;
           
       }
       else if(d>c) {return y;
           
       }
       else{return  Math.min(x,y);
           
       }
    }
}