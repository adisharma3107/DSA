public class CheckPalindrome {

    public static int reverse(int n){
        int y = 0;
        while(n > 0){
            int digit = n % 10;
            y = y * 10 + digit;
            n = n/10;
        }

        return y;
    }

    public static void main(String[] args) {
        int n = 515;
        if(reverse(n) == n){
            System.out.print("It is palindrome.");
        }else{
            System.out.print("It's not a palindrome.");
        }
    }
}
