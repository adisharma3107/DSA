import java.util.*;
public class ConvertArrayToHashSetUsingArraysAsList {

        // Generic function to convert an Array to Set
        public static <T> Set<T> convertArrayToSet(T array[])
        {

            // Create the Set by passing the Array
            // as parameter in the constructor
            Set<T> set = new HashSet<>(Arrays.asList(array));

            // Return the converted Set
            return set;
        }

        public static void main(String args[])
        {
            // Create an Array
            String array[]
                    = { "Geeks", "forGeeks", "A computer Portal" };

            // Print the Array
            System.out.println("Array: "
                    + Arrays.toString(array));

            // convert the Array to Set
            Set<String> set = convertArrayToSet(array);

            // Print the Set
            System.out.println("Set: " + set);
        }
}
