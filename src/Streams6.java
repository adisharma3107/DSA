import java.util.Arrays;

public class Streams6 {
//    Second lowest element
    public static void main(String[] args) {
        int[] numbers = {5,9,11,2,8,21,1};
        Integer secondLowestNumber = Arrays.stream(numbers).boxed().sorted()
                .skip(1)
                .findFirst()
                .get();
        System.out.println(secondLowestNumber);
    }
}
