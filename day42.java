
class Solution {
    boolean twoSum(int arr[], int target) {
        // code here
        Arrays.sort(arr);
        int n = arr.length;
        int i = 0;
        int j = n-1;
        while(i < j){
            int sum = arr[i] + arr[j];
            if(sum > target){
                j--;
            }else if(sum == target){
                return true;
            }else{
                i++;
            }
        }
        
        return false;
    }
}
