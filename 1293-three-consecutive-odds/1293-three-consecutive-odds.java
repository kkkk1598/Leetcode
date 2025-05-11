class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        boolean res = false;
        if(arr.length <3){
            return res;
        }

        for(int i = 0; i< arr.length - 2; i++){
            if(arr[i] % 2 == 1 && arr[i+1] % 2 == 1 && arr[i+2] % 2 == 1){
                res =true;
            }
        }
        
        return res;
    }
}