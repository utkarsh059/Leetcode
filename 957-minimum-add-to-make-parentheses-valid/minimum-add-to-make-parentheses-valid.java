class Solution {
    public int minAddToMakeValid(String s) {
        int open=0;
        int close=0;
        for(int i=0; i<s.length(); i++){
            char ch=s.charAt(i);
            if(ch=='('){
                open++;
            }
            else{
                //if(ch==')')
              if(open>0){
                open--;
              }
              //empty
              else{
                close++;
              }
            }
        }
        return open+close;

    }
}

// class Solution {
//     public int minAddToMakeValid(String s) {
//         Deque<Character> st= new ArrayDeque<>();

//         int addn=0;
//         for(int i=0; i<s.length(); i++){
//             char ch= s.charAt(i);
//             if(ch=='('){
//                 st.push(ch);
//             }
//             else{
//                 if(st.isEmpty()){
//                     addn++;
//                 }
//                 else{
//                     st.pop();
//                 }
//             }
//         }
//         return addn+st.size();
        
        
//     }
// }