class Solution {
    public int[] sumZero(int n) {
        int[] arr = new int[n];
        int index = -(n / 2);

        for(int i = 0; i< n; i++){
            arr[i] = index;
            index++;
        }

        if(n % 2 == 0){
            int val = n/2;
            arr[val] = index;
        }
        return arr;
    }
}