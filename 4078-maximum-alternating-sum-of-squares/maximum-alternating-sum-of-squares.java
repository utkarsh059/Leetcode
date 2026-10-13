class Solution {
    public long maxAlternatingSum(int[] nums) {
        int n= nums.length;
        long  score=0;
        long  big=0;
        long  small=0;
        for(int i=0; i<n; i++){
            nums[i]=nums[i]*nums[i];
        }
        Arrays.sort(nums);
        for(int i=0; i<n/2; i++){
            small=small+nums[i];
        }
           for(int i=n/2; i<n; i++){
            big=big+nums[i];
        }
        score=big-small;
        return score;
        
    }
}