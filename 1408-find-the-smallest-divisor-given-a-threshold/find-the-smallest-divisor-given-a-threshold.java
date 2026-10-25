class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int n= nums.length;
        int sum=0;
        int mid=0;
        Arrays.sort(nums);
        int s=1;
        int e=nums[n-1];
        while(s<=e){
            sum=0;
            mid=s+(e-s)/2;
            for(int i=0; i<n; i++){
            if(nums[i]%mid==0){
                sum=sum+nums[i]/mid;
            }
            else{
               sum=sum+nums[i]/mid+1;
            }
            }
            if(sum<=threshold){
                e=mid-1;
            }
            else{
                s=mid+1;
            }
            
        }
        return s;
    }
}