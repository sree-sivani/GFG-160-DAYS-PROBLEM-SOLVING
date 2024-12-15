
class Solution:
    #Function to rotate an array by d elements in counter-clockwise direction. 
    def rotateArr(self, arr, d):
        #Your code here
        n = len(arr)
        d %= n
        
        # reversing till d elements
        reverseArray(arr, 0, d-1)
        
        #reversing the rest of the array
        reverseArray(arr, d, n-1)
        
        
        #reversing the complete array
        reverseArray(arr, 0, n-1)
        

# function to reverse the array and the chunks of array
def reverseArray(arr, start, end):
    while(start < end):
        arr[start], arr[end] = arr[end], arr[start]
        start += 1
        end -= 1
            
