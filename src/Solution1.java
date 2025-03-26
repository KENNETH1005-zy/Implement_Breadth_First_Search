import java.util.Arrays;

class Solution {
    public static int[] removeEven(int[] arr) {
        int m = 0;
        for (int i = 0; i < arr.length; i ++) {
            if (arr[i] % 2 != 0)
                m = m + 1;
        }
        int[] odds = new int [m];
        int Index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                odds[Index++] = arr[i];
            }
        }
        return odds;
    }
    public static void main(String args[]) {

        int[][] inputs = {
                {3, 2, 41, 3, 34},
                {-5, -4, -3, -2, -1},
                {-1, 2, 3, -4, -10},
                {1, 2, 3, 7},
                {2, 4, 6, 8, 10},

        };

        for (int i = 0; i < inputs.length; ++i) {
            System.out.print((i + 1) + ".\tInput list: ");
            System.out.println(Arrays.toString(inputs[i]));

            int[] result = removeEven(inputs[i]);

            System.out.print("\n\tFinal list: ");
            System.out.println(Arrays.toString(result));
            System.out.println(new String(new char[100]).replace('\0', '-'));

        }
    }
}