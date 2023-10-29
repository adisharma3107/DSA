import java.util.ArrayList;

public class UniqueElementsInAnArray {
        public static int removeDuplicates(ArrayList<Integer> arr) {
            if (arr.isEmpty()) {
                return 0;
            }

            ArrayList<Integer> uniqueList = new ArrayList<>();
            uniqueList.add(arr.get(0));

            for (int i = 1; i < arr.size(); i++) {
                if (!arr.get(i).equals(arr.get(i - 1))) {
                    uniqueList.add(arr.get(i));
                }
            }

            arr.clear();
            arr.addAll(uniqueList);

            return arr.size();
        }

        public static void main(String[] args) {
            ArrayList<Integer> arr = new ArrayList<>();
            arr.add(1);
            arr.add(2);
            arr.add(2);
            arr.add(3);
            arr.add(4);
            arr.add(4);
            arr.add(5);

            int newSize = removeDuplicates(arr);

            for (int i = 0; i < newSize; i++) {
                System.out.print(arr.get(i) + " ");
            }
        }
}
