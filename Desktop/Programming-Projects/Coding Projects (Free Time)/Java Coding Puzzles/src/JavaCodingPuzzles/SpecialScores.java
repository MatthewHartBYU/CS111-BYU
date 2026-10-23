package JavaCodingPuzzles;

public class SpecialScores {
    public static void main(String[] args){
        int[] a = {12, 10, 4};
        int[] b =  {2, 20, 30};
        System.out.println(scoresSpecial(a,b));
    }
    public static int largestSpecialScore(int[] nums){
        int specialNum = 0;
        for(int num: nums){
            if(num % 10 == 0){
                if(num > specialNum){
                    specialNum = num;
                }
            }
        }
        return specialNum;
    }
    public static int scoresSpecial(int[] a, int[] b) {
        int num1 = largestSpecialScore(a);
        int num2 = largestSpecialScore(b);
        return num1 + num2;
    }
}
