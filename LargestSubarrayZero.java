public class LargestSubarrayZero {
    public static void main(String[] args) {
        // int[] arr = {15, -2, 2, -8, 1, 7, 10, 23};
        int[] arr = {1, 0, 3, -4, 4, 0};

        System.out.println(maxLen(arr, arr.length));
    }

    static int maxLen(int[] arr, int n){
        int max = 0;
        int currentMax = 0;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            if(sum + arr[i] <= 0){
                sum = sum + arr[i];
                currentMax += 1;
            }

            else{
                sum = 0;
                // max = 0; 
                currentMax = 0;
            }

            max = Math.max(currentMax, max);
        }

        return max;
    }
}
