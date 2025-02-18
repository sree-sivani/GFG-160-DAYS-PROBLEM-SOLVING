class Solution {
    public ArrayList<Integer> kLargest(int[] arr, int k) {
        // Your code here
        if(k>arr.length)
        return null;
        Arrays.sort(arr);
        ArrayList<Integer> a = new ArrayList<Integer>();
        int i =arr.length-1;
        while(k--!=0)
            a.add(arr[i--]);
        return a;
    }
}
