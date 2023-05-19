import java.util.HashMap;
// import java.util.Map;

public class LargestSubarrayOpt {
    public static void main(String[] args) {
        int[] arr = {15, -2, 2, -8, 1, 7, 10, 23};
        // int[] arr = {1, 0, 3, -4, 4, 0};

        System.out.println(maxLen(arr, arr.length));
    }

    static int maxLen(int[] arr, int n) {
        int sum = 0, max = 0;

        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        for (int i = 0; i < n; i++) {
            sum = sum + arr[i];

            if (sum == 0) {
                max = i + 1;
            } else {
                if (!map.containsKey(sum)) {
                    map.put(sum, i);
                }

                else {
                    int val = map.get(sum);
                    max = Math.max(max, (i - val));
                }
            }
        }

        return max;
    }
}
