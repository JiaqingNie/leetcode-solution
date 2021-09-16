package Q39CombinationSum;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        findAns(res, new LinkedList<>(), candidates, 0, target);
        return res;
    }

    public void findAns(List<List<Integer>> res, List<Integer> currList, int[] candidates, int currIdx, int target){
        if (target == 0) {
            List<Integer> ans = (List<Integer>) ((LinkedList)currList).clone();
            res.add(ans);
            return;
        }
        for (int i = currIdx; i<candidates.length; i++) {
            int number = candidates[i];
            if (number <= target) {
                currList.add(number);
                findAns(res, currList, candidates, i, target - number);
                currList.remove(currList.size()-1);
            }
        }
    }

    public static void main(String[] args) {
        int[] candidates = new int[]{2,3,6,7};
        //int[] candidates = new int[]{2,3,6,7};
        int target = 7;
        //int target = 1;
        Solution solution = new Solution();
        List<List<Integer>> res = solution.combinationSum(candidates, target);
        System.out.println(res);

    }
}
