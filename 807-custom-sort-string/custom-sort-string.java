class Solution {
    public String customSortString(String order, String s) {
        StringBuilder ans= new StringBuilder();
        int freq[]= new int[26];

        for(int i=0; i<s.length(); i++){
            char ch= s.charAt(i);
            freq[ch-'a']++;
        }
       
        for(int i=0; i<order.length(); i++){
            char ch= order.charAt(i);
            while(freq[ch-'a']>0) {
               ans.append(ch);
              freq[ch - 'a']--;
            }
        }
        for(int i=0; i<26;i++){
            while(freq[i]>0){
                char ch=(char)(i+'a');
                ans.append(ch);
                freq[ch-'a']--;
            }
        }
        return ans.toString();
        
    }
}