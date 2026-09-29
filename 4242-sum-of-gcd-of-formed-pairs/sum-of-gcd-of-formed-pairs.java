class Solution {
    public int gcd(int a, int b ){
        while(b!=0){
            int temp=b;
            b=a%b;
            a=temp;
        }
        return a;
    }
    public long gcdSum(int[] nums) {
        int n=nums.length;
        int max=nums[0];
        int [] prefixGcd=new int[n];
        long gcdSum=0;
        int []sum=new int[n];
        for(int i=0; i<n; i++){
  
                if(nums[i]>max){
                    max=nums[i];
                }
            
            prefixGcd[i]=gcd(nums[i],max);

        }
        Arrays.sort(prefixGcd);
        int m=prefixGcd.length;
        int i=0;
        int j=n-1;
        while(i<j){
           sum[i] =gcd(prefixGcd[i],prefixGcd[j]);
            gcdSum=gcdSum+sum[i];
            i++;
            j--;
        }
 
        return gcdSum;
        
    }
}