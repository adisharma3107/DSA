import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class ScannerClass2 {

        public static void main(String[] args)
                throws FileNotFoundException
        {
            File file = new File(
                    "C:\\Users\\aditi\\Desktop\\test.txt");
            Scanner sc = new Scanner(file);

            // we just need to use \\Z as delimiter
            sc.useDelimiter("\\Z");

            System.out.println(sc.next());
        }
}
