import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListPractice {
    public static void main (String [] args){
        LinkedList<Integer> l1 = new LinkedList<>();
        l1.add(1);
        l1.add(2);

        Iterator<Integer> itr = l1.listIterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
     }
}
