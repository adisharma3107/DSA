import java.util.*;
public class SortAnArrayList {
        public static void main(String args[])
        {

            // Get the ArrayList
            List<String>
                    list = new ArrayList<String>();

            // Populate the ArrayList
            list.add("Geeks");
            list.add("For");
            list.add("ForGeeks");
            list.add("GeeksForGeeks");
            list.add("A computer portal");

            // Print the unsorted ArrayList
            System.out.println("Unsorted ArrayList: "
                    + list);

            // Sorting ArrayList in ascending Order
            // using Collection.sort() method
            Collections.sort(list);

            // Print the sorted ArrayList
            System.out.println("Sorted ArrayList "
                    + "in Ascending order : "
                    + list);
        }
}
