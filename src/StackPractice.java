import java.util.Iterator;
import java.util.Stack;

public class StackPractice {
    public static void main (String [] args){
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);

        for (Integer integer : s) {
            System.out.println(integer);
        }
    }
}
