import java.util.*;
public class ConvertArrayToSetUsingSetOfMethod {

        public static <T> Set<T> convertArrayToSet(T array[])
        {
            // create a set from the array
            return new HashSet<>(Set.of(array));
        }

        public static void main(String args[])
        {
            // create an Array
            String array[] = { "geeks", "forgeeks",
                    "learning","platform" };

            // printing the Array
            System.out.println("Array: " + Arrays.toString(array));

            // declare the set object and call the function for conversion
            Set<String>
                    set = convertArrayToSet(array);

            // print the Set
            System.out.println("Set: " + set);
        }
}
