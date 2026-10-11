class Solution {
    public int longestValidParentheses(String s) {
        int n=s.length();
        int open=0;
        int close=0;
        int max=0;
        //left to right
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            if(ch=='('){
                open++;
            }
            else{
                close++;
            }
            if(close>open){
                open=0;
                close=0;
            }
            else if(open==close){
                max=Math.max(max,close*2);
            }
        }
        open=0;
        close=0;
        //right to left
         for(int i=n-1;i>=0;i--){
            char ch=s.charAt(i);
            if(ch=='('){
                open++;
            }
            else{
                close++;
            }
            if(close<open){
                open=0;
                close=0;
            }
            else if(open==close){
                max=Math.max(max,open*2);
            }
        }
        return max;
    }
}

// class Solution {
//     public int longestValidParentheses(String s) {
//   Deque<Integer> st= new ArrayDeque<>();
//         st.push(-1);
//         int maxLen=0;
//         for(int i=0; i<s.length(); i++){
//             char ch= s.charAt(i);
//             if(ch=='('){
//                 st.push(i);
//             }
//             else{
//                 st.pop();
//                 //invalid case
//                 if(st.isEmpty()){
//                     st.push(i);
//                 }//valid case
//                 else{
//                   int  currLen=i-st.peek();
//                   maxLen=Math.max(maxLen,currLen);

//                 }
//             }
//         }
//         return maxLen;

        
//     }
// }