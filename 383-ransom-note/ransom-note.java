class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int freq1[]=new int[26];
        int freq2[]=new int [26];
        int s=ransomNote.length();
        int t=magazine.length();
        for(int i=0; i<s; i++){
            char ch= ransomNote.charAt(i);
            freq1[ch-'a']++;
        }
          for(int i=0; i<t; i++){
            char ch= magazine.charAt(i);
            freq2[ch-'a']++;
        }
        for(int i=0; i<26; i++){
            //Agar ransomNote ko kisi character ki jitni quantity chahiye magazine mein usse kam hai
            if(freq1[i]>freq2[i]){
                return false;
            }
        }
        return true;
        
    }
}