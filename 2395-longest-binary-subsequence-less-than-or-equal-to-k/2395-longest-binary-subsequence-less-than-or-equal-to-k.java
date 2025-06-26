class Solution {
    public int longestSubsequence(String s, int k) {
        int zero = 0;
        int num = 0;
        int len = 0;
        int expo = 0;
        char[] words = s.toCharArray();
        // count zeros
        for(char i: words){
            if(i == '0') zero++;
        }

        // check the numbers
        for (int i = words.length - 1; i >= 0; i--) {
            
            num += (words[i] - '0') * Math.pow(2, expo);
            // we found the maximum number
            if(k < num){
                break;
            }
            
            expo++;
            len++;
            if(words[i] == '0') zero--;
        }

        return len + zero;
    }
}