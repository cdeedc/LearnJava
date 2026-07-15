import java.util.Scanner;

public class mergesort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        
        for(int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        sort(arr, 0, n - 1);

        for(int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
        System.out.println();

        sc.close();
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
