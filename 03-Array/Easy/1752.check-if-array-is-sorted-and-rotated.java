/*
 * @lc app=leetcode id=1752 lang=java
 *
 * [1752] Check if Array Is Sorted and Rotated
 */

// @lc code=start
class Solution {
    public boolean check(int[] nums) {
    int n=nums.length;
    int counter=0;
    for(int i=0;i<n;i++)
    {
        if(nums[i]>nums[(i+1)%n])
        {
            counter++;
        }
    }
    return counter <=1;
    }
}


// @lc code=end

