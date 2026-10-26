class Solution {
    public List<String> buildArray(int[] target, int n) {
        int m=target.length;
        List<String> ans= new ArrayList<>();
           int j=1;
           int i=0;
        while(i<m &&j<=n){
             
               if(target[i]==j){
                ans.add("Push");
                j++;
                i++;
                }else{
                    ans.add("Push");
                    ans.add("Pop");
                    j++;
                } 
        }
        return ans;
        
    }
}