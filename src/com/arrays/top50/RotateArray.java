package com.arrays.top50;

import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args){
        RotateArray ro = new RotateArray();
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        ro.rotate(nums, 3);
    }
    public void rotate(int[] nums, int k) {
        if(nums.length == 1)
            return;
        if(k>=nums.length)
            k=k%nums.length;
        int[] newArr = new int[nums.length];
        for(int j=1 ; j<=k ; j++)
            newArr[k-j] = nums[nums.length-j];
        for(int i = 0; i< nums.length-k ; i++) {
            newArr[i + k] = nums[i];
        }
        System.arraycopy(newArr, 0, nums, 0, nums.length);
        Arrays.stream(nums).forEach(System.out::print);
    }
}
