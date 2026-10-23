package JavaCodingPuzzles;

public class MaxInArray {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        int maxNum = nums[0];
        for(int i = 0; i < nums.length; i++){
            if (nums[i] > maxNum) {
                maxNum = nums[i];
            }

        }
        System.out.println("Array:");
        for(int num: nums){
            System.out.print(num + " ");
        }
        System.out.println();
        System.out.println("Largest Number in Array: " + maxNum);

  }
}
