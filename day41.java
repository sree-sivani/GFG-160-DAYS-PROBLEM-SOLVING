class Solution {
    public void setMatrixZeroes(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;
        
        int c0 = 1;
        
        
        // marking the first rows and columns which consist 0's
        for(int i  = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(mat[i][j] == 0){
                    
                    // marking the row
                    mat[i][0] = 0;
                    
                    if(j == 0){
                        // using this variable so that we can know if we have to 
                        // mark the first col or not
                        c0 = 0;
                    }else{
                        // marking the column 
                        mat[0][j] = 0;
                    }
                }
            }
        }
        
        // marking the matrix from 1,1 to n-1, m-1
        for(int i = 1; i < n; i++){
            for(int j = 1; j < m; j++){
                if(mat[i][0] == 0 || mat[0][j] == 0){
                    mat[i][j] = 0;
                }
            }
        }
        
        // marking the first row
        if(mat[0][0] == 0){
            for(int i  = 0; i < m; i++){
                mat[0][i] = 0;
            }
        }
        
        if(c0 == 0){
            for(int i = 0; i < n; i++){
                mat[i][0] = 0;
            }
        }
    }
}
