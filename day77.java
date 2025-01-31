class Solution {
    
  public void solve(int col, int [][] board,ArrayList<ArrayList<Integer>> ans,ArrayList<Integer> ds,int rHash[],int dHash[],int lHash[])
    {
        int n=rHash.length;
        if(col==n){
            // System.out.println("Ans are here");
            // for(int c:ds){
            //     System.out.print(c+" ,");
            // }
            //  System.out.println(",");
            ans.add(new ArrayList<>(ds));
            return;
        }
        
        for(int i=0;i<n;i++){
            if(board[i][col]==0 && rHash[i]==0 && dHash[n-1+(col-i)]==0 && lHash[i+col]==0){
                board[i][col]=1;
                ds.add(i+1);
                lHash[i+col]=1;
                rHash[i]=1;
                dHash[n-1+(col-i)]=1;
                solve(col+1,board,ans,ds,rHash,dHash,lHash);
                board[i][col]=0;
                ds.remove(ds.size() - 1);
                lHash[i+col]=0;
                 rHash[i]=0;
                 dHash[n-1+(col-i)]=0;
            }
        }
        
    }
    public ArrayList<ArrayList<Integer>> nQueen(int n) {
        // code here
        ArrayList<ArrayList<Integer>> ans=new ArrayList<>();
        ArrayList<Integer> ds= new ArrayList<>();
        int [][] board=new int[n][n];
        for(int r[]:board){
            Arrays.fill(r,0);
        }
        int rHash[] =new int[n];
        int dHash[] = new int[2*n-1];
        int lHash[] =new int [2*n-1];
        Arrays.fill(rHash,0);
        Arrays.fill(dHash,0);
        Arrays.fill(lHash,0);
        solve(0,board,ans,ds,rHash,dHash,lHash);
        
        return ans;
    }
}
