public class TestNonZeros {
    public static void main(String[] args) {
        int[] arrA = { 0, 1, 2, 3, 2 };
        testArray(arrA);

        int[] arrB = { 0, 0 };
        testArray(arrB);

        int[] arrC = { 22, 0, -5, 0, 126 };
        testArray(arrC);

        int[] arrD = { 1, 0 };
        testArray(arrD);
    }

    public static void testArray(int[] arr) {
        System.out.print("Passing ");
        printArray(arr);
        System.out.print(" ... got back ");
        printArray(nonZeros(arr));
        System.out.println();
    }

    public static void printArray(int[] arr) {
        System.out.print("[ ");
        for(int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
        System.out.print("]");
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
