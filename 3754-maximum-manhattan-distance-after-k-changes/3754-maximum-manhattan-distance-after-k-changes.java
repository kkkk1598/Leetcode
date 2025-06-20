class Solution {
    public int maxDistance(String s, int k) {
        if(s == null) return 0;
        int result = 0;
        int north = 0, south = 0, east = 0, west = 0;

        for(char c: s.toCharArray()) {
            switch  (c) {
                case 'N':
                    north++;
                    break;
                case 'S':
                    south++;
                    break;
                case 'W':
                    west++;
                    break;
                case 'E':
                    east++;
                    break;
            }
            int times1 = Math.min(Math.min(north, south), k);
            int times2 = Math.min(Math.min(east, west), k - times1);
            result = Math.max(result, count(north, south, times1) + count(east, west, times2));
        }
        return result;
    }

    private int count(int drt1, int drt2, int times){
        return Math.abs(drt1 - drt2) + times * 2;
    }
}