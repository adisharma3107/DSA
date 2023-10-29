import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListPractice {
    public static void main (String [] args){
        List<Integer> l1 = new ArrayList<>();
        l1.add(1);
        l1.add(2);
        l1.add(3);

        Iterator<Integer> itr = l1.listIterator();

        while(itr.hasNext()){
            System.out.println(itr.hasNext());
        }
    }
}
