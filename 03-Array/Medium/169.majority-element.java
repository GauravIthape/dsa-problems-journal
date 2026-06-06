/*
 * @lc app=leetcode id=169 lang=java
 *
 * [169] Majority Element
 */

// @lc code=start
class Solution {
    public int majorityElement(int[] nums) {
        int freq=0;
        int ans =0;

        for(int i=0;i<nums.length;i++)
        {
            if(freq == 0)
            {
                ans=nums[i];
            }

            //same element freq ++
            if(ans==nums[i])
            {
                freq++;
            }
            else
            {
                freq--;
            }
        }
        return ans;
    }
}
// @lc code=end

