class Solution:
    # Function to find the majority elements in the array
    def findMajority(self, arr):
        #Your Code goes here.
        n = len(arr)
        floor_val = n // 3
        
        # using the hashmap -> dictionary
        freq = {}
        
        # the array which we return
        res = []
        
        # we are finding the frequency of each number in arr
        for ele in arr:
            freq[ele] = freq.get(ele, 0) + 1
            
        # checking if any of the value in key-value exceeds our floor_val
        for ele, count in freq.items():
            if count > floor_val:
                res.append(ele)
                
         
        #  this is if there are only 2 elements in the arr -> res then we sort it
        # for readability and consistency to make easier while validating the outputs
        if len(res) == 2 and res[0] > res[1]:
            res[0], res[1] = res[1], res[0]
            
            
        return res
