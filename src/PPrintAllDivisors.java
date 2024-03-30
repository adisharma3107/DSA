import java.util.*;
public class PPrintAllDivisors {

    public static void printDivisors(int n){
        System.out.println("The divisors of "+ n + " are:");
        int m = (int)Math.sqrt(n);
        for(int i = 0; i <= m ; i++){
            if(n % i == 0){
                System.out.print(i + " ");
                if(i != n/i) {
                    System.out.print(n/i + " ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 5;
        printDivisors(n);
    }
}
