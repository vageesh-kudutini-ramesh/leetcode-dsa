/*
Problem: Two Sum
LeetCode: https://leetcode.com/problems/two-sum/
Difficulty: Easy
Approach: Brute Force
Time Complexity: O(n2)
Space Complexity : O(1)
*/

//Code:
class Solution {
    public int[] twoSum(int[] nums, int target) {
        for(int i = 0 ; i < nums.length ; i++) {
            for(int j = i+1; j < nums.length; j++) {
                if(nums[i] + nums[j] == target) {
                    return new int[]{i,j};
                }
            }
        }

        /*
        if the index pair is not found, it has to return something which is why this
        return statement
        */

        return new int[]{};
    }
}