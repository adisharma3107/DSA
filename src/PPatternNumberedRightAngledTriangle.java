public class PPatternNumberedRightAngledTriangle {

    public static void pattern(int n){
        for(int i = 0; i < n ; i++){
            for(int j = 0 ; j < i ; j++) {
                if (j % 2 == 0) {
                    System.out.print("1");
                }
            }
        }
    }

    public static void main(String[] args) {
        int n = 5;
        pattern(n);
    }
}
