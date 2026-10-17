class Solution {
    public String reverseParentheses(String s) {
        Deque<Character> st= new ArrayDeque<>();
        StringBuilder rev=new StringBuilder();
        
        for(int i=0; i<s.length(); i++){
            char ch=s.charAt(i);
           if(ch!=')'){
            st.push(ch);
           }
            if(!st.isEmpty() &&ch==')'){
                while(!st.isEmpty()&& st.peek()!='('){
                    rev.append(st.pop());
                    
                }
                //opening bracket ko push nhi krna h rev mein lekin pop krna h isliye while ke bahar
                st.pop();
            }
          for(int j=0; j<rev.length();j++){
            char sb=rev.charAt(j);

            st.push(sb);
           
          }
          rev.setLength(0);
            
        }
      while(!st.isEmpty()){
        rev.append(st.peek());
        st.pop();
       }
       return rev.reverse().toString();
        
    }
}