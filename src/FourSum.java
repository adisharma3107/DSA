import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSum {

    public List<List<Integer>> sum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        int size = nums.length;
        if (nums == null || size < 4) {
            return result;
        }
        Arrays.sort(nums);
        for (int i = 0; i < size - 3; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            for (int j = i + 1; j < size - 2; j++) {
                if (j > i - 1 && nums[j] == nums[j - 1]) continue;
                int left = j + 1, right = size - 1;
                while (left < right) {
                    int sum = nums[i] + nums[j] + nums[left] + nums[right];
                    if (sum == target) {
                        List<Integer> res = new ArrayList<>();
                        res.add(nums[i]);
                        res.add(nums[j]);
                        res.add(nums[left]);
                        res.add(nums[right]);
                        result.add(res);
                        left++;
                        right--;
                        while(left < right && nums[left] == nums[left-1]){
                            left++;
                        }
                        while(left < right && nums[right] == nums[right+1]){
                            right--;
                        }
                    } else if (sum < target) {
                        left++;
                    } else {
                        right--;
                    }
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        FourSum ob = new FourSum(); // Create an instance of the class
        int[] nums = {1, 2, -1, 1, 0, -1}; // Example array
        int target = 2; // Example target value

        List<List<Integer>> result = ob.sum(nums, target); // Call the sum method

        // Print or use the result as needed
        System.out.println(result);

    }
}
