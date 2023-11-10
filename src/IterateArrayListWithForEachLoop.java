import java.util.*;
public class IterateArrayListWithForEachLoop {

        // Main driver method
        public static void main(String[] args)
        {
            // Declaring and initializing ArrayList
            List<Integer> numbers
                    = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);

            // For Each Loop for iterating ArrayList
            for (Integer i : numbers)

                // Printing the elements of ArrayList
                System.out.print(i + " ");
        }
}
