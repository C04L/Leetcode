public class Main {

    public static int[] getConcatenation(int[] nums) {
        int resultLength = nums.length*2;
        int[] result = new int[resultLength];
        for (int i = 0; i < nums.length; i++) {
            result[i] = nums[i];
            result[i+nums.length] = nums[i];
        }
        return result;
    }

    public static void main(String[] args) {

        int[] nums = {1,2,1};
        int[] result = getConcatenation(nums);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }
}