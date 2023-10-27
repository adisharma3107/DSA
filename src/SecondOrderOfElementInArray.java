import java.util.Arrays;
public class SecondOrderOfElementInArray {

        int secondlargest(int n, int[] a) {
            int largest = a[0];
            int slargest = -1;

            for (int i = 1; i < n; i++) {
                if (a[i] > largest) {
                    slargest = largest;
                    largest = a[i];
                } else if (a[i] < largest && a[i] > slargest) {
                    slargest = a[i];
                }
            }
            return slargest;
        }

        int secondsmallest(int n, int[] a) {
            int smallest = a[0];
            int ssmallest = Integer.MAX_VALUE;

            for (int i = 1; i < n; i++) {
                if (a[i] < smallest) {
                    ssmallest = smallest;
                    smallest = a[i];
                } else if (a[i] != smallest && a[i] < ssmallest) {
                    ssmallest = a[i];
                }
            }
            return ssmallest;
        }

        public static int[] getSecondOrderElements(int n, int[] a) {
            int slargest = new SecondOrderOfElementInArray().secondlargest(n, a);
            int ssmallest = new SecondOrderOfElementInArray().secondsmallest(n, a);
            return new int[] {slargest, ssmallest};
        }

        public static void main(String[] args) {
            int[] a = {5, 2, 7, 1, 6, 3};
            int[] result = getSecondOrderElements(a.length, a);
            System.out.println("Second Largest: " + result[0]);
            System.out.println("Second Smallest: " + result[1]);
        }

}
