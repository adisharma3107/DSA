import java.util.ArrayList;
import java.util.HashSet;
public class ConvertHashSetToArrayList {

        public static void main(String[] args)
        {

            HashSet<String> flower_set = new HashSet<>();

            flower_set.add("tulip");
            flower_set.add("rose");
            flower_set.add("orchid");
            flower_set.add("marie-gold");

            // Pass hashset to arraylist constructor
            ArrayList<String> flower_array
                    = new ArrayList<>(flower_set);

            // all elements from hashset are copied to arraylist
            System.out.println(
                    "Elements of flower Arraylist are :");
            System.out.println(flower_array);

            // using the get method of Arraylist to get the
            // element at index=0
            System.out.print("Element at index 0 is : "
                    + flower_array.get(0) + " ");
        }

}
