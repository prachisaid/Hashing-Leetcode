import java.util.HashMap;

public class LongestSubstring{
    public static void main(String[] args) {
        String str = "abcabba";

        System.out.println(longestSubstring(str));
    }

    static int longestSubstring(String arr){

        int max = 0;
        int cnt = 0;
        HashMap<Character, Integer> freq = new HashMap<Character, Integer>();

        for (int i = 0; i < arr.length(); i++) {
            if(freq.get(arr.charAt(i)) == null){
                freq.put(arr.charAt(i), 1);
                max++;
            }

            else if(freq.get(arr.charAt(i)) != null){
                freq.clear();
                freq.put(arr.charAt(i), 1);
                max = 1;
            }

            cnt = Math.max(max, cnt);
        }

        return cnt;
    }
}