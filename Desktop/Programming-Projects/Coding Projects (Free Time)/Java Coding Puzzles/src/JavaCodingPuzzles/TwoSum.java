package JavaCodingPuzzles;

public class TwoSum {
    public static void main(String[] args){
        int targetSum = 9;
        int[] nums = {2,6,7,8,5};
        for(int i = 0; i<nums.length-1; i++){
            for(int j = i + 1; j < nums.length; j++){
                if(nums[i] + nums[j] == targetSum){
                    System.out.println("Target Sum Found: " + targetSum);
                    System.out.println("Numbers That Add up To Sum:");
                    System.out.println(nums[i] + " found at index " + i);
                    System.out.println(nums[j] + " found at index " + (i + 1));
                    break;
                }
            }
        }
    }
}
