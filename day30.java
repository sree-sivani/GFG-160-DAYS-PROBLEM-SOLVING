class Solution {
    int search(int[] arr, int target) {
        // Complete this function
        int n = arr.length;

        int left = 0;
        int right = n - 1;
        
        //finding the pivot point of rotation
        while(left < right){
            int mid = left + (right - left) / 2;
            if(arr[mid] < arr[right]){
                right = mid;
            }else{
                left = mid + 1;
            }
        }
        
        // finding the correct half
        int start = left;
        left = 0; 
        right = n - 1;
        
        if(target >= arr[start] && target <= arr[right]){
            left = start;
        }else{
            right = start;
        }
        
        // binary search in the selected half 
        while(left <= right){
            int mid = left + (right - left) / 2;
            if(arr[mid] == target){
                return mid;
            }else if(arr[mid] > target){
                right = mid - 1;
            }
            else{
                left = mid + 1;
            }
        }
        
        return -1;
    }
}
