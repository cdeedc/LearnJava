public class TestNonZeros {
    public static void main(String[] args) {
        int[] arr = { 0, 1, 2, 3, 4, 0, 5, 0, 6 };
        printArray(nonZeros(arr));
    }

    public static void printArray(int[] arr) {
        for(int i = 0; i < arr.length; i++)
            System.out.println(arr[i] + " ");
        System.out.flush();
    }

    public static int[] nonZeros(int[] arr) {
        int cnt = 0;
        for(int i = 0; i < arr.length; i++)
            if(arr[i] != 0)
                cnt++;
        
        int[] res = new int[cnt];
        int ind = 0;
        for(int i = 0; i < arr.length; i++)
            if(arr[i] != 0)
                res[ind++] = arr[i];
        
        return res;
    }
}
