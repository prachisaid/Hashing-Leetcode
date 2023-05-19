import java.util.HashMap;

public class CountXOR {
    public static void main(String[] args) {
        int arr[] = {5, 6, 7, 8, 9};

        System.out.println(solve(arr, 6));
    }

    static int solve(int[] A, int B){
        HashMap<Integer, Integer> freq = new HashMap<Integer, Integer>();
        int cnt = 0;
        int xor = 0;

        for(int i = 0; i < A.length; i++){
            xor = xor ^ A[i];

            if(xor == B){
                cnt++;
            }

            if(freq.get(xor ^ B) != null){
                cnt += freq.get(xor^B);
            }

            if(freq.get(xor) != null){
                freq.put(xor, freq.get(xor)+1);
            }else{
                freq.put(xor, 1);
            }
        }

        return cnt;
    }
}
