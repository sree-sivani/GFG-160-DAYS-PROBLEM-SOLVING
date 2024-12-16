class Solution:
    def nextPermutation(self, arr):
        # code here
        # length of the array
        n = len(arr)
        
        # assuming the pivot index as -1
        # we will find a pivot index later
        # else we will know that the given permutation is the last index 
        # so we return the ascending order of the whole array
        # eg: 5 4 3 2 1
        # we will return 1 2 3 4 5
        
        pivot = -1
        
        
        # finding the pivot index from the right most side
        for i in range(n-2, -1, -1):
            if arr[i] < arr[i+1]:
                pivot = i
                break
            
            
        # if pivot element is not found it means no next permutation is existing
        # hence we return the array in reverse order -> ascending order
        
        if pivot == -1:
            arr.reverse()
            return
        
        
        # finding the next greater value than the pivot element and swapping them both
        
        for i in range(n-1, pivot, -1):
            if(arr[i] > arr[pivot]):
                arr[i], arr[pivot] = arr[pivot], arr[i]
                break
            
            
        # reverse the elements after the pivot elements for the next permutatio
        left, right = pivot+1, n-1
        while(left < right):
            arr[left], arr[right] = arr[right], arr[left]
            left += 1
            right -= 1
