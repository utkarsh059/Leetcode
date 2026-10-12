// usnig stack
class Solution {
    public String removeDuplicates(String s) {

        Deque<Character> st=new ArrayDeque<>();
      StringBuilder str=new StringBuilder();

        for(int i=0; i<s.length(); i++){
            char ch=s.charAt(i);
          if(!st.isEmpty()){
            if(ch==st.peek()){
                st.pop();
            }
            else{
                st.push(ch);
            }
          }
          else{
            st.push(ch);
          }
        }
      while(!st.isEmpty()){
       str.append(st.peek());
        st.pop();
      }
      return str.reverse().toString();
    }
}

//using string
// class Solution {
//     public String removeDuplicates(String s) {
//         StringBuilder ans = new StringBuilder();

//         for(int i=0; i<s.length(); i++){
//             char ch=s.charAt(i);
        
//         if(ans.length()>0 && ans.charAt(ans.length()-1)==ch){
//             ans.deleteCharAt(ans.length()-1);
//         }
//         else{
//             //if these 2 are different chacracters
//             ans.append(ch);
//         }
//         }
//         return ans.toString();
        
//     }
// }