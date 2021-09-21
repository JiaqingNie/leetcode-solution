package Q40CombinationSumII;

import java.util.*;

public class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> result = new ArrayList<>();
        findAns(result, new LinkedList<>(), candidates, 0, target);

        return result;
    }

    public void findAns(List<List<Integer>> result, List<Integer> currList, int[] candidates, int currIdx, int target){
        if (target == 0) {
            List<Integer> ans = (List<Integer>) ((LinkedList)currList).clone();
            result.add(ans);
            return;
        }
        Set<Integer> set = new HashSet<>();
        for (int i = currIdx; i<candidates.length; i++) {
            int number = candidates[i];
            if (set.contains(number)) {
                continue;
            } else {
                set.add(number);
            }
            if (number <= target) {
                currList.add(number);
                findAns(result, currList, candidates, i+1, target - number);
                currList.remove(currList.size()-1);
            }
        }
    }


    public static void main(String[] args) {
        int[] candidates = new int[]{10,1,2,7,6,1,5};
        int target = 8;
        Solution solution = new Solution();
        System.out.println(solution.combinationSum2(candidates, target));
    }
}
