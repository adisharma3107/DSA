import java.util.*;
public class ArrayListToStringUsingCopyOf {
        // Main driver method
        public static void main(String[] args)
        {

            // Creating an empty ArrayList of string type
            ArrayList<String> al = new ArrayList<String>();

            // Populating the ArrayList by custom elements
            al.add("Anshul Aggarwal");
            al.add("Mayank Solanki");
            al.add("Abhishek Kelenia");
            al.add("Vivek Gupta");

            String[] answer = Arrays.copyOf(
                    al.toArray(), al.size(), String[].class);
            System.out.println(Arrays.toString(answer));
        }
}
