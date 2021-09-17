package Q27RemoveElement;

public class Solution {
    public int removeElement(int[] nums, int val) {
        int p = nums.length - 1;
        int i = 0;
        while (i <= p) {
            if (nums[i] == val) {
                nums[i] = nums[p];
                p--;
            } else {
                i++;
            }
        }
        return p+1;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{3,2,2,3};
        Solution solution = new Solution();
        System.out.println(solution.removeElement(nums, 2));
    }
}
