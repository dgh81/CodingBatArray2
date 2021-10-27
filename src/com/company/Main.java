package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] nums = {1,2,3,4,0};
        countEvens(nums);
        System.out.println(countEvens(nums));
        System.out.println(bigDiff(nums));
    }
    public static int countEvens(int[] nums) {
        int counter = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                counter++;
            }
        }
        return counter;
    }

    public static int bigDiff(int[] nums) {
        int max = 0;
        int min = 2000000000;
        for (int i = 0; i < nums.length; i++) {

            if(nums[i] > max) {
                max = nums[i];
            }
            if(nums[i] < min) {
                min = nums[i];
            }
        }
        return max-min;
    }

    

}
