class Solution {
    public List<String> letterCombinations(String digits) {
        // base case
        if(digits == null || digits.length() == 0) return new ArrayList<String>();
        List<String> res = new ArrayList<String>();
        Stack<Integer> reverseDigits = new Stack<Integer>();
        HashMap<Integer, List<Character>> keypad = PhoneBook();
        // add digits for return value
        for(char i: digits.toCharArray()){
            reverseDigits.push(i - '0');
        }
        // initialize return array
        if(res.isEmpty()) {
            List<Character> firstDigitChars = keypad.get(reverseDigits.pop());
            for(char c : firstDigitChars) {
                res.add(String.valueOf(c));
            }
        }

        // process appending
        while(!reverseDigits.empty()){
            int currentDigit = reverseDigits.pop();
            List<Character> prefix = keypad.get(currentDigit);
            res = populateArray(prefix, res);
        }
        
        return res;
    }

    // populate array
    private List<String> populateArray(List<Character> prefix, List<String> arr){
        List<String> newString = new ArrayList<String>();
        for(char i: prefix){
            for(String str: arr){
                String ele = i + str;
                newString.add(ele);
            }
        }
        return newString;
    }

    // manage phone number and letters
    private HashMap<Integer, List<Character>> PhoneBook(){
        HashMap<Integer, List<Character>> keypad = new HashMap<Integer, List<Character>>();
        String[] letters = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

        for (int i = 2; i <= 9; i++) {
            List<Character> charList = new ArrayList<>();
            for (char c : letters[i].toCharArray()) {
                charList.add(c);
            }
            keypad.put(i, charList);
        }
        return keypad;
    }
}