class Solution {
    public long maxAlternatingSum(int[] nums) {
        int n= nums.length;
        long arr[]=new long[n];
        long  score=0;
        long  big=0;
        long  small=0;
        long sum=0;
        for(int i=0; i<n; i++){
            arr[i]=sum+nums[i]*nums[i];
            
        }
        Arrays.sort(arr);
        int m=arr.length;
  
        for(int i=0; i<m/2; i++){
            small=small+arr[i];
        }
           for(int i=m/2; i<n; i++){
            big=big+arr[i];
        }
        score=big-small;
        return score;
        
    }
}