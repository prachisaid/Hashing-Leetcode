import java.util.HashSet;

public class LongestSequence {
    public static void main(String[] args) {
        int[] arr = {102, 4, 100, 1, 101, 3, 2};


        System.out.println("Max" + longestSeq(arr));
    }

    static int longestSeq(int[] nums){
        HashSet<Integer> set = new HashSet<Integer>();

        for(int i = 0; i < nums.length; i++){
            set.add(nums[i]);
        }

        // int cnt = 1;

        // for (int i = 0; i < nums.length; i++) {
        //     System.out.println(i);
        //     if(set.contains(nums[i] - 1)){
        //         System.out.println(nums[i]);
        //     }

        //     else{
        //         int cur = nums[i];
        //         for(int j = 1; set.contains(cur+j); j++){
        //             cnt++;
        //             System.out.println("Cnt" +cnt);
        //         }
        //     }

        //     maxCnt = Math.max(maxCnt, cnt);
        //     cnt = 1;
        // }

        // return maxCnt;

        int longestStreak = 0;

        for(int num : nums){
            if(!set.contains(num-1)){
                int currentNum = num;
                int currentStreak = 1;

                while(set.contains(currentNum+1)){
                    currentNum+=1;
                    currentStreak+=1;
                }

                longestStreak = Math.max(longestStreak, currentStreak);;
            }
        }

        return longestStreak;
    } 
}
