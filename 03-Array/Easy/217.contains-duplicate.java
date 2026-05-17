/*
 * @lc app=leetcode id=217 lang=java
 *
 * [217] Contains Duplicate
 */

import java.util.HashSet;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> hs=new HashSet<>();
        int value=nums[0];
        hs.add(value);
        for(int i=1;i<nums.length;i++)
        {
            if(hs.contains(nums[i]))
            {
                return true;
            }
            hs.add(nums[i]);
        }
        return false;

    }
}


