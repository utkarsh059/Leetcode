class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int ans[]=new int[nums1.length];
        int n=nums2.length;
         int arr[] = new int [n];

        Deque<Integer> st= new ArrayDeque<>();
        for(int i=n-1; i>=0; i--){
            while(!st.isEmpty()&& st.peek()<=nums2[i]){
                st.pop();
            }
               if(st.isEmpty()){
                arr[i]=-1;
                st.push(nums2[i]);

               }
               else{
                arr[i]=st.peek();
                st.push(nums2[i]);
               }
        }
        int k=0;
   for(int i=0; i<nums1.length; i++){
    for(int j=0; j<n; j++){
        if(nums1[i]==nums2[j]){
            ans[k]=arr[j];
            k++;
        }
    }
   }
        return ans;   
    }
}