import java.util.HashMap;

public class LongestSubstring2 {
    public static void main(String[] args) {
        String str = "abcabba";

        System.out.println(longestSubstring(str));
    }

    static int longestSubstring(String s){
        int len = 0;
        int left = 0, right = 0;
        int n = s.length();

        HashMap<Character, Integer> map = new HashMap<>();

        while(right < n) {
            if(map.containsKey(s.charAt(right))){
                left = Math.max(map.get(s.charAt(right)) +1 , left);
            }

            map.put(s.charAt(right), right);
            len = Math.max(len, right - left + 1);
            right++;
        }

        return len;

    }
}
