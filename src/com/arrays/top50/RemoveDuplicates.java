package com.arrays.top50;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] nums = {1,1,1,2,2,3}; // Input array
        int k = removeDuplicates(nums); // Calls your implementation
        System.out.println(k);

    }
    public static int removeDuplicates(int[] nums) {
        int writeIndex = 1;
        int repeatedCount = 0;
        int prevElement = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != prevElement) {
                repeatedCount = 0;
            } else {
                repeatedCount++;
            }

            if (repeatedCount <= 1) {
                nums[writeIndex++] = nums[i];
                prevElement = nums[i];
            }
        }
        return writeIndex;
    }
}