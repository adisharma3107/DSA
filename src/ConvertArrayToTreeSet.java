import java.util.*;
public class ConvertArrayToTreeSet {
        public static void main(String args[]) {
            String[] arr = {"Alive", "is" , "Awesome"};
            // Converting Array to list
            List<String> list = Arrays.asList(arr);
            // Converting list to TreeSet
            TreeSet<String> treeset = new TreeSet<>(list);
            // Iterating and Printing TreeSet elements
            for(String str : treeset)
            {
                System.out.println(str);
            }
        }
}
