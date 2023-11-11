import java.util.*;
public class IterateOverTreeMap2 {

        public static void main(String[] args)
        {

            // Creating a TreeMap class object
            // Objects are of key-value pairs (integer and
            // string type)
            TreeMap<Integer, String> tm
                    = new TreeMap<Integer, String>();

            // Customly adding elements
            tm.put(1, "Geeks");
            tm.put(2, "For");
            tm.put(3, "Geeks");

            // Get all entries using the entrySet() method
            Set<Map.Entry<Integer, String> > entries
                    = tm.entrySet();

            // Way 1
            // Using for loops
            for (Map.Entry<Integer, String> entry : entries) {
                System.out.println(entry.getKey() + "->"
                        + entry.getValue());
            }

            // New line to differentiate differences in output
            // between for loop and for each loop
            System.out.println();

            // Way 2 - getting code shorter and simpler
            // For each loops

            entries.forEach(entry -> {
                System.out.println(entry.getKey() + "->"
                        + entry.getValue());
            });

            // New line to differentiate differences in output
            // between for each loop and iterator traversal
            System.out.println();

            // Way 3 - New way to
            // Getting an iterator
            Iterator<Map.Entry<Integer, String> > iterator
                    = entries.iterator();

            // Additional step here
            // To Initialize object holding for
            // key-value pairs to null
            Map.Entry<Integer, String> entry = null;

            // Holds true till there is no element remaining in
            // the object using hasNExt() method
            while (iterator.hasNext()) {

                // Moving onto next pairs using next() method
                entry = iterator.next();

                // Printing the key-value pairs
                // using getKey() and getValue() methods
                System.out.println(entry.getKey() + "->"
                        + entry.getValue());
            }
        }
}
