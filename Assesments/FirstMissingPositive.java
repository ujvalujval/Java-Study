
public class FirstMissingPositive {
    public static void main(String[] args) {
        int[] nums = { 3, 4, -1, 1 };

        int n = nums.length;

        for (int i = 0; i < n; i++) {
            while (nums[i] > 0 && nums[i] <= n && nums[i] != nums[nums[i] - 1]) {
                int temp = nums[i];
                nums[i] = nums[nums[i] - 1];
                nums[temp - 1] = temp;
            }
        }
        for (int i = 0; i < n; i++) {
            if (nums[i] != i + 1) {
                System.out.println(i + 1);
                return;
            }
        }


        System.out.println(n + 1);
    }
}