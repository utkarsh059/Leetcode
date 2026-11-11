class Solution {
    public int minOperations(int n) {
        int check=0;
        if(n==1){
            return 0;
        }
        if(n%2==0){
            check=n/2;
            return check*check;
        }
        else{
            check=(n-1)/2;
            int check2=check+1;
            check=check*check2;
        
            return check;
        }
       
        
    }
}