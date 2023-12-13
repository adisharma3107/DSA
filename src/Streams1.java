import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.List;

public class Streams1 {
//    Count the occurence of each caharacter in a string

    public static void main(String[] args) {
    String input = "ilovejava";

    Map<String, Long> map = Arrays.stream(input.split("")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
    System.out.println(map);
//    String[] result = input.split("");
//    First convert the string to array to iterate over it
//        System.out.println(Arrays.toString(result));

//         Practice without streams
//        HashMap<Character , Integer> charCount = new HashMap<>();
//        char[] a = input.toCharArray();
//
//        for(char e : a ){
//            if(charCount.containsKey(e)){
//                charCount.put(e, charCount.get(e) +1);
//            }else{
//                charCount.put(e, charCount.get(e));
//            }
//        }
//
//        for(Map.Entry entry : charCount.entrySet()){
//            System.out.println(entry.getKey() + " " + entry.getValue());
//        }

    }
}
