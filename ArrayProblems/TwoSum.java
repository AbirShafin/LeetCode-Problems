package ArrayProblems;
import java.util.Arrays;
//LeetCode 1
//Question:
//Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
//You may assume that each input would have exactly one solution, and you may not use the same element twice.
//You can return the answer in any order.
//
//Example 1:
//Input: nums = [2,7,11,15], target = 9
//Output: [0,1]
//Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
public class TwoSum {
    public static void main(String[] args){
        int[] sample = {2,7,11,15};
        int target = 9;
        System.out.println(Arrays.toString(twoSum(sample, target)));
    }
    public static int[] twoSum(int[] nums, int target) {
            for(int i=0; i<nums.length-1; i++){
                for(int j=i+1; j<nums.length; j++){
                    if((nums[i]+nums[j])==target){
                        return new int[] {i,j};
                    }
                }
            }
            System.out.print("Not found");
            return new int[] {};
        }
    }

