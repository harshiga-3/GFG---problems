class Solution {
    public static ArrayList<Integer> findUnion(int[] a, int[] b) {
        // code here
        HashSet<Integer> s=new HashSet<>();
        
        for(int n:a)
        {
            s.add(n);
        }
        
        for(int n:b)
        {
            s.add(n);
        }
        return new ArrayList<>(s);
        
    }
}