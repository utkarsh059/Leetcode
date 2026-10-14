class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Deque<Integer> st=new ArrayDeque<>();
        int n=temperatures.length;
        int arr[] =new int[n];

        for(int i=0;i<n; i++){
            while(!st.isEmpty()&& temperatures[i]>temperatures[st.peek()]){
                int j=st.pop();
                arr[j]=i-j;

            }
            st.push(i);
       
        }
        return arr;
        

    }
}