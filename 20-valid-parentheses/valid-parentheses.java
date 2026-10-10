class Solution {
    public boolean isValid(String s) {
        Deque<Character> st= new ArrayDeque<>();
        
        for(int i=0;i<s.length(); i++){
            char ch=s.charAt(i);
           if(ch=='(' || ch=='[' || ch=='{'){
            st.push(ch);
           }
           else{
            if(st.isEmpty()){
                return false;
            }
            if(ch==')' && st.peek()!='('){
                return false;
            }
              else if(ch==']' && st.peek()!='['){
                return false;
            }
              else if(ch=='}' && st.peek()!='{'){
                return false;
            }
            else{
                st.pop();
            }
           }
            }
        
        if(st.isEmpty()){
            return true;
        }
        else{
            return false;
        }
        
    }
}