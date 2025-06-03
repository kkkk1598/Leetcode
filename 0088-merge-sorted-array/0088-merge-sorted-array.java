class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int pivot1 = m - 1;
        int pivot2 = n - 1;
        int right = m + n - 1;

        while(pivot2 >=0 ){
            if(pivot1 >= 0 && nums1[pivot1] > nums2[pivot2]){
                nums1[right] = nums1[pivot1];
                pivot1--;
            } else{
                nums1[right] = nums2[pivot2];
                pivot2--;
            }
            right--;
        }
    }
}