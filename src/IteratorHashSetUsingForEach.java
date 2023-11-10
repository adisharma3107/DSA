import java.util.*;
public class IteratorHashSetUsingForEach {

        public static void main(String[] args)
        {
            // Creating a new HashSet for iteration
            HashSet<String> set = new HashSet<>();

            // Add data to HashSet
            set.add("Hello");
            set.add("geeks");
            set.add("on");

            // duplicates not allowed in HashMap, so avoid by
            // HashMap
            set.add("geeks");
            set.add("for");

            // duplicates not allowed in HashMap, so avoid by
            // HashMap
            set.add("geeks");

            System.out.println(
                    "Iterate HashSet using forEach loop : ");

            // Iterate throw a forEach method in Java
            set.forEach(System.out::println);
        }
}
