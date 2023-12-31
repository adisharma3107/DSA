import java.util.*;
public class ArrayListToStringUsingToString {
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

            // Converting above List to array using toArray()
            // method and storing it in an string array
            String k[] = al.toArray(new String[al.size()]);

            // Iterating over above string array
            for (String str : k) {

                // Printing the elements in above array
                System.out.println(str);
            }
        }
}
