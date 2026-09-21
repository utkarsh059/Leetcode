class Solution {
    public int countDigitOccurrences(int[] nums, int digit) {
        int n= nums.length;
        int cnt=0;
        for(int i=0; i<n; i++){
            int k=nums[i];
            while(k>0){
            int arrDigit=k%10;
            if(arrDigit==digit){
                cnt++;
            }
            k=k/10;
            }
        }
        if(cnt==0){
            return 0;
        }
        return cnt;
    }
}