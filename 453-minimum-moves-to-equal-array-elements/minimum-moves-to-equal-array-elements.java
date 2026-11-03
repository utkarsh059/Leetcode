class Solution {
    public int minMoves(int[] nums) {
        int count=0;
        int sum=0;
        int n=nums.length;
        int min=Integer.MAX_VALUE;
    for(int i=0; i<n; i++){
        min=Math.min(nums[i],min);
    }
        for(int i=0; i<n;i++){
            sum=0;
           sum=nums[i]-min;
           count=count+sum;
           
        }

        return count;
    }
}