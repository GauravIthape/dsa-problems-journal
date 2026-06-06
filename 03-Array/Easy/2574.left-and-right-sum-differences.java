/*
 * @lc app=leetcode id=2574 lang=java
 *
 * [2574] Left and Right Sum Differences
 */

// @lc code=start
class Solution {
    public int[] leftRightDifference(int[] nums) {
        int[] answer=new int[nums.length];
        int left=0;
        int right;
        int totalsum=0;


        for (int i : nums) {
              totalsum += i; // 2. Add to the existing variable
        }

        for(int i=0;i<nums.length;i++)
        {
            right=totalsum-left-nums[i];
            answer[i]=Math.abs(right-left);
            left+=nums[i];
        }
        return answer;
    }
}
// @lc code=end

