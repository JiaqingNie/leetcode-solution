package Q88MergeSortedArray;

public class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int i = nums1.length-1; i>= nums1.length-m; i--) {
            nums1[i] = nums1[i+m-nums1.length];
        }

        int p1 = nums1.length - m;
        int p2 = 0;
        int p = 0;
        while (p < nums1.length) {
            if (p1 < nums1.length && p2 < nums2.length) {
                if (nums1[p1] < nums2[p2]) {
                    nums1[p] = nums1[p1];
                    p1++;
                } else {
                    nums1[p] = nums2[p2];
                    p2++;
                }
            } else if (p1 < nums1.length) {
                nums1[p] = nums1[p1];
                p1++;
            } else {
                nums1[p] = nums2[p2];
                p2++;
            }
            p++;
        }

        // below only for testing
        for (int i : nums1) {
            System.out.println(i);
        }

    }

    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};
        Solution solution = new Solution();
        solution.merge(nums1, 3, nums2, 3);
    }
}
