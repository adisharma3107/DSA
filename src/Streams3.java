import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Streams3 {
//    unique elements in a string
    public static void main(String[] args) {
        String input = "ilovejava";
        List<String> uniqueElements = Arrays.stream(input.split(""))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream().filter(x -> x.getValue() == 1)
                .map(Map.Entry::getKey).collect(Collectors.toList());
        System.out.println(uniqueElements);
    }
}
