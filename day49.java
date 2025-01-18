class Solution {
    public int countSubarrays(int arr[], int k) {
        // code here
        HashMap<Integer,Integer> h = new HashMap<>();
       h.put(0,1);
      
       int prefix=0;
       int c=0;
       for(int i=0;i<arr.length;i++)
       {
           prefix=prefix+arr[i];
           if(h.containsKey(prefix-k))
           {
               c=c+h.get(prefix-k);
           }
           h.put(prefix,h.getOrDefault(prefix,0)+1);
           
       }
       return c;
    }
    
    
}
