public class PArmstrongNumber {

    public static boolean armstrongNumber(int n){
        int org = n;
        int count = 0;
        int temp = n;
        while(temp != 0){
            count++;
            temp = temp / 10;
        }

        int sumOfpower = 0;
        while(n != 0){
            int digit = n % 10;
            sumOfpower += Math.pow(digit, count);
            n /= 10;
        }
        return (sumOfpower == org);
    }

    public static void main(String[] args) {
        int n = 1324;
        if(armstrongNumber(n)){
            System.out.println("It is an armstrong number.");
        }else{
            System.out.println("It is not an armstrong number.");
        }

    }
}
