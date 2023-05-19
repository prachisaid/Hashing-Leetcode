import java.util.*;

public class TwoSum {
    public static void main(String[] args) {
     
        int [] arr = {2, 5, 6, 8, 11};

        int[] ans = twoSum(arr, 20);

        System.out.println(Arrays.toString(ans));
        
    }

    static int[] twoSum(int[] nums, int target) {
       int[] result = new int[2];

       HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

       for(int i = 0; i < nums.length; i++){
            if(map.containsKey(target - nums[i])){
                result[1] = i;
                result[0] = map.get(target-nums[i]);
                return result;
            }

            map.put(nums[i], i);
       }

       return result;

    }
}
