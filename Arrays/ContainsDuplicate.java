/*
Problem: Contains Duplicate
LeetCode: https://leetcode.com/problems/contains-duplicate/
Difficulty: Easy
Approach: HashSet (Hashing)
Time Complexity: O(n)
Space Complexity : O(n)
*/

//Code
import java.util.HashSet;
class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for(int number : nums) {
            if(set.contains(number)) {

                //returns true if the duplicate is found
                return true; 
            }

            set.add(number);
        }

        //return false if the elements are distinct in the nums array
        return false;
    }
}