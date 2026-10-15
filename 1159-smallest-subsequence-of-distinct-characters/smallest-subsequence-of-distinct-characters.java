class Solution {
    public String smallestSubsequence(String s) {
        Deque<Character> st= new ArrayDeque<>();
        int arr[]=new int [26];
        for(int i=0; i<s.length(); i++){
            char ch=s.charAt(i);
            arr[ch-'a']++;
        }
        int freq []=new int[26];

        for(int i=0; i<s.length(); i++){
            char ch=s.charAt(i);
            arr[ch-'a']--;
            if(freq[ch-'a']==1){
                continue;
            }
            while(!st.isEmpty() && st.peek()>ch&& arr[st.peek()-'a']>0){
                freq[st.peek()-'a']=0;
                st.pop();
    
            }
            if(freq[ch-'a']==0){
                st.push(ch);
                freq[ch-'a']=1;
            }
           

        }
        StringBuilder ans= new StringBuilder();
        while(!st.isEmpty()){
            ans.append(st.peek());
            st.pop();

        }
        return ans.reverse().toString();
        
        
    }
}