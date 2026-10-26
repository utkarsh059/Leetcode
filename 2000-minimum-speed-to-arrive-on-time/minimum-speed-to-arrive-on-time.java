class Solution {
    public int minSpeedOnTime(int[] dist, double hour) {
        int n=dist.length;
        int s=1;
        int e=10000000;
        double sum=0;
        while(s<=e){
             sum=0;
            int mid=s+(e-s)/2;
            for(int i=0; i<n-1; i++){
                if(dist[i]%mid==0 ){
                    sum+=dist[i]/mid;
                }
                else{
                    sum+=dist[i]/mid+1;
                }
            }
            sum+=(double)dist[n-1]/mid;
            if(sum<=hour){
                e=mid-1;
            }
            else{
                s=mid+1;
            }
        }
        if(s>=10000001){
            return -1;
        }

        return s;
        
    }
}