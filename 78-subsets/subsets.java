class Solution {
    public void getSubsets(int index,int[]nums,List<Integer>arr,List<List<Integer>>ans){
        if(index>=nums.length){
         ans.add(new ArrayList<>(arr));
         return;
        }
        arr.add(nums[index]);
        getSubsets(index+1,nums,arr,ans);

        arr.remove(arr.size()-1);
          getSubsets(index+1,nums,arr,ans);


    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
         List<Integer> arr=new ArrayList<>();
        int index=0;

        getSubsets(index,nums,arr,ans);
        return ans;

        
    }
}