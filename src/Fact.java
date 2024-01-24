public class Fact {
    public static void main(String[] args) {
        int n = 5;
        int res = fact(n);
        System.out.println(res);
//        for(int i=0; i<n; i++){
//            System.out.println(fact(i));
//        }
    }

    static int fact(int x){
        if( x <= 1){
            return x;
        }else{

        }
        return x * fact(x-1);
    }
}
