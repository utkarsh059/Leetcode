class Solution {
    public String reverseWords(String s) {
        StringBuilder sb= new StringBuilder();
        int n=s.length();
        int i=0; 
        while(i<n){
          
            while(i<n && s.charAt(i)!=' '){
                i++;

            }
               int j=i-1;
            while(j>=0 && s.charAt(j)!=' '){
                sb.append(s.charAt(j));
                j--;
            }
            if(i<n){
                  sb.append(' ');
            }
            i++;
        }
        return sb.toString();
        
    }
}