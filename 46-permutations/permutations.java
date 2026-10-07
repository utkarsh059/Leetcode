class Solution {
    public void Permutations(int[] nums,List<Integer> ds, List<List<Integer>> ans, boolean []freq){
        if(ds.size()==nums.length){
            ans.add(new ArrayList<>(ds));
            return;
        }
        for(int i=0; i<nums.length;i++){
            //I can pic nums[i] if(not marked)in my map
            if(!freq[i]){
                //mark it as picked
                freq[i]=true;
                ds.add(nums[i]);
                //again call
                Permutations(nums,ds,ans,freq);
                ds.remove(ds.size()-1);
                //mark false to non mark it 
                freq[i]=false;
            }
        }

    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> ds=new ArrayList<>();
       
       //for mapping 
        boolean freq[]=new boolean[nums.length];

        Permutations(nums,ds,ans,freq);
        return ans;
        
    }
}