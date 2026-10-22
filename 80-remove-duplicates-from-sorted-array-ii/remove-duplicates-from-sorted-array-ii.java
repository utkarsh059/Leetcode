class Solution {
    public int removeDuplicates(int[] nums) {
        int n=nums.length;
        int i=2;
        int j=2;
        if(n<=2){
            return n;
        }

        while(j<n){
          if(nums[j]!=nums[i-2]){
            nums[i]=nums[j];
            i++;
          }
          j++;
        }
          return i;
    }
}