class Solution {
    public int reverse(int x) {
        int ans=0;
        long rev=0;
        int original=x;
        double y=-Math.pow(2,31);
        double z=Math.pow(2,31)-1;
        if(x<y || x>z){
            return 0;
        }
        x=Math.abs(x);
        while(x>0){
            int digits=x%10;
            rev=rev*10+digits;
            x=x/10;
        }
        
        if(rev>z){
         return 0;
           }
           else{
            ans=(int)rev;
           }
        
        if(original<0){
            ans=-ans;
        }
        
       return ans;
        
    }
}