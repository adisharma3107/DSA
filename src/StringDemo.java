import java.util.stream.IntStream;
public class StringDemo {
    public static void main(String[] args) {
        String str = "Hello, World!";

        IntStream.range(0, str.length())
                .forEach(i -> System.out.println(str.charAt(i) + " = " + IntStream.range(0, str.length())
                        .filter(j -> str.charAt(i) == str.charAt(j))
                        .count()));
    }
}
