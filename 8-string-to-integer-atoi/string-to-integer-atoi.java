class Solution {
    public int myAtoi(String s) {
        StringBuilder str= new StringBuilder();
        long ans=0;
        int condn1=Integer.MAX_VALUE;
        int condn2=Integer.MIN_VALUE;
        for(int i=0; i<s.length(); i++){
            char ch= s.charAt(i);
            if(ch==' ' && str.length()==0){
                continue;
            }
            else if(ch=='-' || ch=='+') {
               if(str.length()==0){
                str.append(ch);
               }
               else{
                break;
               }
            }
            else if(ch>='0' && ch<='9') {
               str.append(ch);
               }
             else {
              break;
            }
        }
    
           if (str.length() == 1 &&
                  (str.charAt(0)=='-' || str.charAt(0)=='+')) {
               return 0;
            }
        boolean isNegative = false;
        for(int i=0; i<str.length(); i++){
            char ch=str.charAt(i);
            if(ch=='-'){
                isNegative=true;
            }
            else if(ch=='+'){
                isNegative=false;
            }
        else{
            int digit = ch - '0';

        if (isNegative) {
            if (ans > (2147483648L - digit) / 10) {
                return Integer.MIN_VALUE;
            }
        }
        
        else {
            if (ans > (2147483647L - digit) / 10) {
                return Integer.MAX_VALUE;
            }
        }
         ans = ans * 10 + digit;
        }
        }
        if(isNegative==true)
       ans=-ans;
       if(ans>condn1){
        return condn1;
       }
       if(ans<condn2){
        return condn2;
       }
       int result=(int)ans;
       
       return result;

        
    }
}