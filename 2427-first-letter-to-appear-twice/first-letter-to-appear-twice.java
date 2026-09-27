class Solution {
    public char repeatedCharacter(String s) {
        boolean [] count=new boolean[26];
        for(int i=0; i<s.length();i++){
            char ch = s.charAt(i);
     
         if(count[ch-'a']==true){
            return ch;
         }
         count[ch-'a']=true;
         
        }

        return ' ';

    }
}