class Solution {
    public void findCombination(int ind,int[]arr,int target,int k,List<List<Integer>> ans,List<Integer> ds){
        if(ind==arr.length){
            if(target==0 && ds.size()==k){
             ans.add(new ArrayList<>(ds));
    
            }
            return;
            }
             if(arr[ind]<=target){
              ds.add(arr[ind]);
         findCombination(ind+1,arr,target-arr[ind],k,ans,ds);
            ds.remove(ds.size()-1); 
        }
        findCombination(ind+1,arr,target,k,ans,ds);
    }
    public List<List<Integer>> combinationSum3(int k, int n) {
        int arr[]=new int[9];
        for(int i=1; i<=9; i++){
            arr[i-1]=i;
        }
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> ds= new ArrayList<>();
        findCombination(0,arr,n,k,ans,ds);
        return ans;
        
    }
}