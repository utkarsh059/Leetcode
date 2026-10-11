class Solution {
    public int longestValidParentheses(String s) {
  Deque<Integer> st= new ArrayDeque<>();
        st.push(-1);
        int maxLen=0;
        for(int i=0; i<s.length(); i++){
            char ch= s.charAt(i);
            if(ch=='('){
                st.push(i);
            }
            else{
                st.pop();
                //invalid case
                if(st.isEmpty()){
                    st.push(i);
                }//valid case
                else{
                  int  currLen=i-st.peek();
                  maxLen=Math.max(maxLen,currLen);

                }
            }
        }
        return maxLen;

        
    }
}