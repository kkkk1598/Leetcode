class Solution {
    public String[] divideString(String s, int k, char fill) {
        int remainder = s.length() % k;
        
        // Add padding if needed
        if (remainder != 0) {
            for(int i = 0; i < k - remainder; i++){
                s += fill;
            }
        }
        
        String[] res = new String[s.length() / k];
        int index = 0;
        
        for(int i = 0; i < res.length; i++){
            String ele = s.substring(index, index + k);
            res[i] = ele;
            index += k;
        }

        return res;
    }
}