import java.util.*;
public class SizeOfArrayList {
        public static void main(String[] args)
                throws Exception
        {

            // Creating object of ArrayList<Integer>
            List<Integer>
                    arrlist = new ArrayList<Integer>();

            // Populating arrlist
            arrlist.add(1);
            arrlist.add(2);
            arrlist.add(3);
            arrlist.add(4);
            arrlist.add(5);

            // print arrlist
            System.out.println("ArrayList: "
                    + arrlist);

            // getting total size of arrlist
            // using size() method
            int size = arrlist.size();

            // print the size of arrlist
            System.out.println("Size of ArrayList = "
                    + size);
        }
}
