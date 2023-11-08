import java.util.*;
public class MaxElementUsingCollectionsInAnArray {
        public static void main(String[] args){
            int arr[] = {10, 324, 45, 90, 9808};
            List<Integer> list=new ArrayList<>();
            for(int i=0;i<arr.length;i++)
            {
                list.add(arr[i]);
            }
            System.out.println("Largest in given array is " +Collections.max(list));
        }

}
