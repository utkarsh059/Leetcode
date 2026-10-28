class Solution {
    int ans=Integer.MAX_VALUE;
    public int findMin(int[] nums) {
        for(int i=0; i<nums.length; i++){
             ans=Math.min(nums[i],ans);
        }
        return ans;
        
    }
}