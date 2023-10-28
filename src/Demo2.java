import java.util.stream.Collector;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Demo2 {
    public static void main(String [] args){
        List<Integer> num = Arrays.asList(1, 2, 3, 4, 5);
                // Print the odd numbers in the array using a stream.
        List<Integer> odd = num.stream().filter(s -> s % 2 != 0).collect(Collectors.toList());
        System.out.println(odd);

    }
}
