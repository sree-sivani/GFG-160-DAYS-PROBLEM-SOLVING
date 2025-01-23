class Solution {

    // a: input array
    // n: size of array
    // Function to find maximum circular subarray sum.
    public int circularSubarraySum(int arr[]) {

        // Your code here
        int n=arr.length;
        int sum1=0,sum2=0, min=Integer.MAX_VALUE, max=Integer.MIN_VALUE,total=0;
        for(int i=0;i<n;i++)
        {
            total+=arr[i];
            sum2=Math.min(arr[i],sum2+=arr[i]);
            min=Math.min(min,sum2);
            sum1=Math.max(arr[i],sum1+=arr[i]);
            max=Math.max(max,sum1);
        }
        return Math.max(max,(total-min));
    }
}
