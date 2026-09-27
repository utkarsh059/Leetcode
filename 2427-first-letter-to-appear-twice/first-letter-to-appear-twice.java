class Solution {
    public char repeatedCharacter(String s) {
        int [] count=new int[26];
        for(int i=0; i<s.length();i++){
            char ch = s.charAt(i);
     
         if(count[ch-'a']==1){
            return ch;
         }
         count[ch-'a']++;
         
        }

        return ' ';

    }
}