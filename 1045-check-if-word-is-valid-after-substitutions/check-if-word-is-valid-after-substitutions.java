class Solution {
    public boolean isValid(String s) {
        Deque<Character> st =new ArrayDeque<>();

        for(char i=0; i<s.length(); i++){
            char ch=s.charAt(i);
            if(ch=='a'|| ch=='b'){
                st.push(ch);
            }
            //agr a aur b nhi h to c hoga 
            else{
                if(st.size()<2){
                    return false;

                }
                if(st.peek()!='b'){
                    return false;
                }
                st.pop();
                if(st.peek()!='a'){
                    return false;
                }
                st.pop();
                
            }
        }
        if(st.isEmpty()){
            return true;
        }
        return false;
        
    }
}