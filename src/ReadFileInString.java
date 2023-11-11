import java.nio.file.*;
public class ReadFileInString {

        public static String readFileAsString(String fileName)
                throws Exception
        {
            String data = "";
            data = new String(
                    Files.readAllBytes(Paths.get(fileName)));
            return data;
        }

        public static void main(String[] args) throws Exception
        {
            String data = readFileAsString(
                    "C:\\Users\\aditi\\Desktop\\test.java");
            System.out.println(data);
        }
}
