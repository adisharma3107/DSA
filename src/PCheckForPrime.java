public class PCheckForPrime {

    static int i = 2;
    public static boolean isPrime(int n){

        if(n == 1 || n == 0){
            return false;
        }
        if(n == i){
            return true;
        }
        if(n % i == 0){
            return false;
        }
        i++;
        return isPrime(n);
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(isPrime(n));
    }
}
