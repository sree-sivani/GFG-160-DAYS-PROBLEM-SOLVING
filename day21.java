class Solution {
    // Function to sort an array of 0s, 1s, and 2s
    public void sort012(int[] arr) {
        // code here
          int n=arr.length;
          HashMap<Integer, Integer> map= new HashMap<>();
          for(int i=0;i<n;i++){
              map.put(arr[i], map.getOrDefault(arr[i],0)+1);
          }
          int idx=0;
          for(int i=0;i<map.getOrDefault(0,0);i++){
              arr[idx++]=0;
          }
           for(int i=0;i<map.getOrDefault(1,0);i++){
              arr[idx++]=1;
          }
           for(int i=0;i<map.getOrDefault(2,0);i++){
              arr[idx++]=2;
           }
    }
}
