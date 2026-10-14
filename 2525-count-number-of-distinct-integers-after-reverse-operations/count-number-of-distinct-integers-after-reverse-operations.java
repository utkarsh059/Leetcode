class Solution {
    public static int Reverse(int num){
        int rev=0;
        while(num>0){
            int digits=num%10;
            rev=rev*10+digits;
            num=num/10;
        }
        return rev;
    }
    public int countDistinctIntegers(int[] nums) {
        int n=nums.length;
        int count=1;
        int arr[]=new int[2*n];
        for(int i=0; i<n; i++){
            arr[i]=nums[i];

        }
        int j=0;
        for(int i=n; i<2*n; i++){
            arr[i]=Reverse(nums[j]);
            j++;
            
        }
        Arrays.sort(arr);
        for(int i=0; i<2*n-1; i++){
            if(arr[i]!=arr[i+1]){
                 count++;
                
            }  
        }
        return count;
        
    }
}