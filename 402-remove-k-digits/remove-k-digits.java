class Solution {
    public String removeKdigits(String num, int k) {
        Deque<Character> st=new ArrayDeque<>();

        for(int i=0; i<num.length(); i++){
            char ch= num.charAt(i);
            while(!st.isEmpty() &&k>0 && st.peek()>ch){
                st.pop();
                k--;
            }
            st.push(ch);
        }
            while(!st.isEmpty() && k>0){
                st.pop();
                k--;
            }
        
        StringBuilder ans=new StringBuilder();
        while(!st.isEmpty() ){
            ans.append(st.peek());
            st.pop();
        }
        ans.reverse();
        int index=0;
        while(index<ans.length() && ans.charAt(index)=='0'){
            index++;
        }
        String result= ans.substring(index);

        if(result.length()==0){
            return "0";
        }
        else{
            return result;
        }  
    }
}