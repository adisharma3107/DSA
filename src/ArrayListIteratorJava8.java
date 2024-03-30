import java.util.*;
public class ArrayListIteratorJava8 {
    public static void main(String[] args) {
        ArrayList<String> a1 = new ArrayList<>();
        a1.add("Code in Java 8");
        a1.add("Iterating over ArrayList.");

        a1.forEach(a2 -> {
            System.out.println(a2);
        });

        //UserDefined ArrayList
        List<User> users = new ArrayList<>();
        users.add(new User("Elon", 25));
        users.add(new User("Yadi", 27));
        users.add(new User("Bella", 29));
        users.add(new User("Austin", 21));

        users.forEach(user -> {
            System.out.println("Name : " + user.getName() + " , Age : " + user.getAge());
        });


    }
}
