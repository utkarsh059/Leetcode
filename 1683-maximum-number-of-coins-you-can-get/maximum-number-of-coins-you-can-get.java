class Solution {
    public int maxCoins(int[] piles) {
        Arrays.sort(piles);
        int n=piles.length;
        int count=0;
        int sum=0;
        int fuck=n/3;;
      
        if(n%2==0){
            for(int i=n-2; i>0; i=i-2){
                sum=sum+piles[i];
                count++;
                if(count==fuck)
                break;
            }
        }
        else{
        for(int i=n-2; i>0; i=i-2){
            sum=sum+piles[i];
            count++;
            if(count==fuck)
            break;

        }
        }
        return sum;
        
    }
}