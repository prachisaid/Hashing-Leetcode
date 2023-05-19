import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class FourSum {
    public static void main(String[] args) {
        int[] arr = { 1000000000,1000000000,1000000000,1000000000 };
        List<List<Integer>> lst = new LinkedList<>();
        
        lst = fourSum(arr, 9);
        System.out.println(lst);

    }

    static List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> lst = new LinkedList<>();
        int newTarget = 0;
        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {

            for (int j = i + 1; j < nums.length; j++) {

                newTarget = target - nums[j] + nums[i];
                int low = j + 1;
                int high = nums.length - 1;

                while (low < high) {

                    if (nums[low] + nums[high] < newTarget) {
                        low++;
                    }

                    else if (nums[low] + nums[high] > newTarget) {
                        high--;
                    } else {

                        List<Integer> quad = new ArrayList();
                        quad.add(nums[i]);
                        quad.add(nums[j]);
                        quad.add(nums[low]);
                        quad.add(nums[high]);
                        lst.add(quad);

                        while (low < high && nums[low] == quad.get(2)) {
                            ++low;
                        }

                        while (low < high && nums[high] == quad.get(3)) {
                            --high;
                        }

                        low++;
                        high--;

                    }
                }

                while (j + 1 < nums.length && nums[j + 1] == nums[j]) {
                    ++j;
                }
            }
            while(i + 1 < nums.length && nums[i+1] == nums[i]){
                ++i;
            }

        }

        return lst;
    }
}
