class Solution {
    public int minCost(int n) {
        int ans=0;
        int check=0;
        if(n%2!=0){
           check=n/2;
           ans=check*n;
        }
        if(n%2==0){
            check=n-1;
            ans=n/2*check;
        }
        return ans;
        
    }
}