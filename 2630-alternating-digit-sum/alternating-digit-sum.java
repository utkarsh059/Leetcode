class Solution {
    public int alternateDigitSum(int n) {
        int sum=0;
        int cnt=0;
        int totalDigit=0;
        int orig=n;
        while(n>0){
            int digit=n%10;
            totalDigit++;
            n=n/10;
        }
        while(orig>0){
            int digits=orig%10;
            cnt++;
            if((totalDigit-cnt)%2==0){
                 digits=digits;
            }else{ 
             digits=-digits;
            }
            sum=sum+digits;
            orig=orig/10;

        }
        return sum;
        
    }
}