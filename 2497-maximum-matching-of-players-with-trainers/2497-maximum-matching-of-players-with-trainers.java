class Solution {
    public int matchPlayersAndTrainers(int[] players, int[] trainers) {
        Arrays.sort(players);
        Arrays.sort(trainers);

        int n = players.length;
        int res = 0;
        for(int i = 0, j = 0; i < n; i++){
            // Keep advancing j until we find a trainer that can train player i
            while(j < trainers.length && trainers[j] < players[i]){
                j++;
            }
            
            // If we found a suitable trainer, match them
            if(j < trainers.length){
                res++;
                j++; // Move to next trainer
            }
        }
        
        return res;
    }
}