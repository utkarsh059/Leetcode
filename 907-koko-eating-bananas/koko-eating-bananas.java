class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int n=piles.length;
        Arrays.sort(piles);
        int s=1;
        int e=piles[n-1];
        long sum=0;

        while(s<=e){
            int mid=s+(e-s)/2;
            sum=0;
            for(int i=0; i<n; i++){
                if(piles[i]%mid==0){
                    sum+=piles[i]/mid;
                }
                else{
                    sum+=piles[i]/mid+1;
                }
            }
            if(sum<=h){
                e=mid-1;
            }
            else{
                s=mid+1;
            }
        }
        return s;
        
    }
}