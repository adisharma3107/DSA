public class FibonnacciSeries {

    public static void main(String[] args) {
        int n =7;
        for(int i = 0; i < n; i++){
            System.out.println(fibonnacci(i));
        }

    }

    static int fibonnacci(int x) {
        if (x <= 1) {
            return x;
        }
        else{
            return fibonnacci(x-1) + fibonnacci(x-2);
        }
    }
}
