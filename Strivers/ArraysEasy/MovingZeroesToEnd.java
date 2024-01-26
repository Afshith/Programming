package Strivers.ArraysEasy;

import java.util.Arrays;

public class MovingZeroesToEnd {
    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12};
        nums = moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static int[] moveZeroes(int[] nums) {
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                swap(nums, i, j);
                j++;
            }
        }
        return nums;
    }
    public static void swap(int nums[], int index1, int index2) {
        int temp = nums[index1];
        nums[index1] = nums[index2];
        nums[index2] = temp;
    }
}
