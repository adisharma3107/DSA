public class LeftShiftArrayElementsByOne {
        static int[] rotateArray(int[] arr, int n) {
            int temp = arr[0];
            for(int i=1;i<n;i++){
                arr[i-1] = arr[i];
            }
            arr[n-1] = temp;
            return arr;
        }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int n = arr.length; // Assuming you want to rotate the entire array

        int[] rotatedArr = rotateArray(arr, n);

        // Print the rotated array
        for (int i = 0; i < n; i++) {
            System.out.print(rotatedArr[i] + " ");
        }
    }
}
