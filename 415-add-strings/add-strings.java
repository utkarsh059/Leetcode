class Solution {
    public String addStrings(String num1, String num2) {
       StringBuilder sb = new StringBuilder();
        int carry=0;
        int n=num1.length();
        int m=num2.length();
        int i=n-1;
        int j=m-1;
        int sum=0;
        while(i>=0 || j>=0 || carry!=0 ){
            sum=0;
            if(i>=0){
                sum=sum+num1.charAt(i)-'0';
            }
            if(j>=0){
                sum=sum+num2.charAt(j)-'0';
            }
            sum=sum+carry;
            int digit=sum%10;
            carry=sum/10;
            sb.append(digit);
            i--;
            j--;
        }
        sb.reverse();

        return sb.toString();
        
    }
}