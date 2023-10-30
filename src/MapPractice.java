import java.util.HashMap;
import java.util.Map;

public class MapPractice {
        public static void main(String [] args){
            Map<Integer,String> map=new HashMap<Integer,String>();
            map.put(100,"Amit");
            map.put(101,"Vijay");
            map.put(102,"Rahul");
            //Elements can traverse in any order
            for(Map.Entry m:map.entrySet()){
                System.out.println(m.getKey()+" "+m.getValue());
            }
            //Returns a Set view of the mappings contained in this map
            map.entrySet()
                    //Returns a sequential Stream with this collection as its source
                    .stream()
                    //Sorted according to the provided Comparator
                    .sorted(Map.Entry.comparingByValue())
                    //Performs an action for each element of this stream
                    .forEach(System.out::println);
        }
}
