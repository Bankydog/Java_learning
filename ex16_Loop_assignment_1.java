// Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

// You may assume that each input would have exactly one solution, and you may not use the same element twice.

// You can return the answer in any order.

public class ex16_Loop_assignment_1 {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15}; 
        int target = 9;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    System.out.println("Indices: " + i + ", " + j); 
                    return; 
                }
            }
        }
        System.out.println("No solution found.");
    }
}
