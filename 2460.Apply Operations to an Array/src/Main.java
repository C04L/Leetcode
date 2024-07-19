public class Main {

    public static int[] applyOperations(int[] nums) {

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i-1]) {
                nums[i-1] = nums[i]*2;
                nums[i] = 0;
            }
        }

        int index=0;
        for (int i=0; i<nums.length; i++)
        {
            if (nums[i]!=0)
            {
                nums[index]=nums[i];
                index++;
            }
        }
        for (int i=index; i<nums.length; i++)
        {
            nums[i]=0;
        }


        for (int i : nums) {
            System.out.println(i);
        }

        return nums;
    }


    public static void main(String[] args) {

        applyOperations(new int[] {847,847,0,0,0,399,416,416,879,879,206,206,206,272});
    }
}