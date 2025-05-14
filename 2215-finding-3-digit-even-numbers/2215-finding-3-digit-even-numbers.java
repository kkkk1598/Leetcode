class Solution {
    public int[] findEvenNumbers(int[] digits) {
        Set<Integer> nums = new HashSet<>();
        int n = digits.length;
        for(int i = 0; i <n; ++i){
            for(int j = 0; j< n; ++j){
                for(int k = 0; k <n; ++k){
                   if(i == j || j == k || i == k){
                    continue;
                   }     
                   int num = digits[i] * 100 + digits[j] * 10 + digits[k];
                   if(num >= 100 && num % 2 == 0){
                        nums.add(num);
                   }
                }
            }
        }

        List<Integer> result = new ArrayList<>(nums);
        Collections.sort(result);
        int[] ree = new int[result.size()];
        for(int i = 0; i < result.size(); ++i){
            ree[i] = result.get(i);
        }


        return ree;
    }
}