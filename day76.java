class Solution {
    double power(double b, int e) {
        // code here
        if(e == 0){
            return 1;
        }
        if(e == 1){
            return b;
        }
        
        if(e == -1){
            return 1 / b;
        }
        
        double p=power(b,e/2);
        if(e%2==0)
            return p*p;
        else if(e>0)
            return p*p*b;
        else
            return p*p/b;
    }
}
