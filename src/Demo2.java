import java.util.stream.Collector;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Demo2 {
    public static void main(String [] args){
//        List<Integer> num = Arrays.asList();
//        List<Integer> odd = num.stream().filter(s -> s % 2 != 0).collect(Collectors.toList());
                int[] array = {1, 2, 3, 4, 5};
        List<Integer> num = Arrays.asList();
                // Print the odd numbers in the array using a stream.
        List<Integer> odd = num.stream().filter(s -> s % 2 != 0).collect(Collectors.toList());

    }
}
