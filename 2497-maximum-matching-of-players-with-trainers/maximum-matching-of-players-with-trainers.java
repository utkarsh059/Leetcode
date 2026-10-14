class Solution {
    public int matchPlayersAndTrainers(int[] players, int[] trainers) {
        Arrays.sort(trainers);
        Arrays.sort(players);
       int n=trainers.length;
       int m=players.length;
       int count=0;
       int i=0;
       int j=0;
       while(i<m && j<n){
        if(players[i]<=trainers[j]){
            count++;
            i++;
            j++;
        }
        else{
            j++;
       }
       }
       return count;
    }
}