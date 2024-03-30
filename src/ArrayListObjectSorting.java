import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ArrayListObjectSorting {
    public static void main(String[] args) {
        List<User> users = new ArrayList<>();
        users.add(new User("Elon", 25));
        users.add(new User("Yadi", 27));
        users.add(new User("Bella", 29));
        users.add(new User("Austin", 21));

        Collections.sort(users, Comparator.comparing(User::getName));
        System.out.println("Sorting ArrayList by User Name : " + users);
    }
}
