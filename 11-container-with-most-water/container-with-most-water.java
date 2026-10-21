class Solution {
    public int maxArea(int[] height) {
        int n=height.length;
        int i=0;
        int j=n-1;
        int max=0;
        int check=0;
        int h=0; 
        int d=0;
        while(i<j){
            d=j-i;
            if(height[i]<height[j]){
                h=height[i];
                i++;
            }
            else{
                h=height[j];
                j--;
            }
            check=h*d;
            if(check>max){
                max=check;
            }
          
           
        }
        return max;
        
    }
}