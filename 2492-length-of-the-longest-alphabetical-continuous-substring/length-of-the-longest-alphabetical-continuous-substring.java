class Solution {
    public int longestContinuousSubstring(String s) {
        int count=1;
        int max=1;
        for(int i=0; i<s.length()-1; i++){
            char ch1=s.charAt(i);
            char ch2=s.charAt(i+1);
            if(ch2-ch1==1){
                count++;
            }
            else
            count=1;
         max=Math.max(count,max);
        }
        return max;
        
    }
}