class GCDSum {
    public static void main(String[] args) {
        int[] nums = { 2, 6, 4 };
        System.out.println(gcdSum(nums));

        nums = new int[] { 3, 6, 2, 8 };
        System.out.println(gcdSum(nums));
    }

    public static long gcdSum(int[] nums) {
        int prefixMax = Integer.MIN_VALUE;
        int[] prefixGcd = new int[nums.length];

        for(int i = 0; i < nums.length; i++) {
            prefixMax = max(prefixMax, nums[i]);
            prefixGcd[i] = gcd(nums[i], prefixMax);
        }

        sort(prefixGcd, 0, prefixGcd.length - 1);

        long sum = 0;
        int l = 0, r = nums.length - 1;
        while(l < r) {
            sum += gcd(prefixGcd[l], prefixGcd[r]);
            l++;
            r--;
        }

        return sum;
    }

    public static int max(int a, int b) {
        return (a > b) ? a : b;
    }

    public static int gcd(int a, int b) {
        while(b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }

    public static void sort(int[] arr, int l, int r) {
        if(l < r) {
            int m = l + ((r - l) >> 1);
            sort(arr, l, m);
            sort(arr, m + 1, r);
            merge(arr, l, m, r);
        }
    }

    public static void merge(int[] arr, int l, int m, int r) {
        int i = l, j = m + 1, k = 0;
        int[] aux = new int[r - l + 1];

        while(i <= m && j <= r) {
            if(arr[i] <= arr[j])
                aux[k++] = arr[i++];
            else
                aux[k++] = arr[j++];
        }

        while(i <= m)
            aux[k++] = arr[i++];

        while(j <= r)
            aux[k++] = arr[j++];

        for(i = 0; i < k; i++)
            arr[l + i] = aux[i];
    }
}