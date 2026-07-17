public class SortedGCDPairQueries {
    public static void main(String[] args) {
        int[] nums = {2, 3, 4};
        long[] queries = {0, 2, 2};
        
        Solution solution = new Solution();
        
        int[] res = solution.gcdValues(nums, queries);
        printArray(res);
    }

    public static void printArray(int[] arr) {
        for(int i : arr)
            System.out.print(i + " ");
        System.out.println();
    }
}

class Solution {
    public final int MAX_V = 50000;

    public int[] gcdValues(int[] nums, long[] queries) {
        long[] cnt = new long[MAX_V + 1];

        for(int num : nums)
            cnt[num]++;

        for(int i = 1; i <= MAX_V; i++)
            for(int j = (i << 1); j <= MAX_V; j += i)
                cnt[i] += cnt[j];

        for(int i = 1; i <= MAX_V; i++)
            cnt[i] = ((cnt[i] * (cnt[i] - 1)) >> 1);

        for(int i = MAX_V; i >= 1; i--)
            for(int j = (i << 1); j <= MAX_V; j += i)
                cnt[i] -= cnt[j];

        for(int i = 1; i <= MAX_V; i++)
            cnt[i] += cnt[i - 1];
        
        int[] res = new int[queries.length];
        int pos = 0;

        for(long idx : queries) {
            int l = 1, r = MAX_V, x = 0;
            
            while(l <= r) {
                int m = l + ((r - l) >> 1);
                if(cnt[m] > idx) {
                    x = m;
                    r = m - 1;
                } else {
                    l = m + 1;
                }
            }

            res[pos++] = x;
        }

        return res;
    }
}