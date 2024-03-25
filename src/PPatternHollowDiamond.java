public class PPatternHollowDiamond {

    public static void pattern(int n){
        int m = 0;
        for(int i = 0; i< n; i++){
            for(int j = 1; j <= n-i ; j++){
                System.out.print("*");
            }

            for(int j = 0; j < m ; j++){
                System.out.print(" ");
            }

            for(int j = 1; j <= n-i ; j++){
                System.out.print("*");
            }
            m+=2;
            System.out.println();
        }

        int l = 2*n-2;
        for(int i = 1; i <= n; i++){
            for(int j = 1 ; j <= i;j++){
                System.out.print("*");
            }

            for(int j=0 ; j < l ; j++ ){
                System.out.print(" ");
            }

            for(int j = 1; j<= i; j++){
                System.out.print("*");
            }

            l-=2;
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n  = 5;
        pattern(n);
    }
}
