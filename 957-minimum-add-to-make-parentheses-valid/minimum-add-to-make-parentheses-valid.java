class Solution {
    public int minAddToMakeValid(String s) {
        Deque<Character> st= new ArrayDeque<>();

        int addn=0;
        for(int i=0; i<s.length(); i++){
            char ch= s.charAt(i);
            if(ch=='('){
                st.push(ch);
            }
            else{
                if(st.isEmpty()){
                    addn++;
                }
                else{
                    st.pop();
                }
            }
        }
        return addn+st.size();
        
        
    }
}