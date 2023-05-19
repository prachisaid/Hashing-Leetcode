import java.util.Arrays;

class Job{
    public int profit;
    public int id;
    public int dur;
}

public class JobSequencing {
    public static void main(String[] args) {
        
    }

    static int[] jobSeq(Job arr[],int n){
        Arrays.sort(arr, (a, b) -> (b.profit - a.profit));

        int maxi = 0;

        for(int i = 0; i < n; i++){
            if(arr[i].dur > maxi){
                maxi = arr[i].dur;
            }
        }

        int result[] = new int[maxi+1];
        int countJob = 0, jobProfit = 0;

        for (int i = 1; i <= maxi; i++) {
            for(int j = arr[i].dur; j > 0; j--){
                if(result[j] == -1){
                    result[j] = i;
                    countJob++;
                    jobProfit += arr[i].profit;
                    break;
                }
            }
        }

        int [] ans = new int[2];
        ans[0] = countJob;
        ans[1] = jobProfit;

        return ans;
    }
}
