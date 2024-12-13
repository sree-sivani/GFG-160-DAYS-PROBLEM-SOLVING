class Solution:
	def pushZerosToEnd(self,arr):
    	# code here
    	
    	count = 0
    	
    	for i in range (len(arr)):
    	    
    	    if arr[i] != 0:
    	        
    	       # swapping the elements
    	        arr[count], arr[i] = arr[i], arr[count]
    	    
    	       # increasing the counter value only if the value is a non zero element
    	        count+=1
