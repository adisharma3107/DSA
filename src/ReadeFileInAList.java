import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;
import java.util.*;
public class ReadeFileInAList{
        public static List<String>
        readFileInList(String fileName)
        {

            List<String> lines = Collections.emptyList();
            try {
                lines = Files.readAllLines(
                        Paths.get(fileName),
                        StandardCharsets.UTF_8);
            }

            catch (IOException e) {

                // do something
                e.printStackTrace();
            }
            return lines;
        }
        public static void main(String[] args)
        {
            List l = readFileInList(
                    "C:\\Users\\aditi\\Desktop\\test.java");

            Iterator<String> itr = l.iterator();
            while (itr.hasNext())
                System.out.println(itr.next());
        }
}
