
class Solution {
    static String trimZeroes(String s){
        int idx = s.indexOf('1');
        return (idx == -1) ? "0" : s.substring(idx);
    }
    
    public String addBinary(String s1, String s2) {
        // code here
        s1 = trimZeroes(s1);
        s2 = trimZeroes(s2);
        
        int n = s1.length();
        int m = s2.length();
        
        if(n < m){
            return addBinary(s2, s1);
        }
        int j = m-1;
        int carry = 0;
        StringBuilder res = new StringBuilder();
        
        for(int i = n-1; i >= 0; i--){
            int bit1 = s1.charAt(i) - '0';
            int bitSum = bit1 + carry;
            
            if(j >= 0){
                int bit2 = s2.charAt(j) - '0';
                bitSum += bit2;
                j--;
            }
            
            int bit = bitSum % 2;
            carry = bitSum / 2;
            
            res.append((char) (bit + '0'));
        }
        
        if(carry > 0){
            res.append('1');
        }
        
        return res.reverse().toString();
    }
}
