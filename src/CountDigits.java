public class CountDigits {

    public static int countDigits(int n){
        String n1 = Integer.toString(n);
        return n1.length();

        // int digits = (int) Math.floor(Math.log10(n) + 1);
        // return digits;
    }

    public static void main(String[] args) {
        int n = 12345;
        System.out.println(countDigits(n));
    }
}
